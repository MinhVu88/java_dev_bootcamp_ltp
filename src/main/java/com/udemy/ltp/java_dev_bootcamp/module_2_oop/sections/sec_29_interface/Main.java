package main.java.com.udemy.ltp.java_dev_bootcamp.module_2_oop.sections.sec_29_interface;

import main.java.com.udemy.ltp.java_dev_bootcamp.module_2_oop.sections.sec_29_interface.constants.AccountType;
import main.java.com.udemy.ltp.java_dev_bootcamp.module_2_oop.sections.sec_29_interface.constants.Transaction;
import main.java.com.udemy.ltp.java_dev_bootcamp.module_2_oop.sections.sec_29_interface.pojo.Checking;
import main.java.com.udemy.ltp.java_dev_bootcamp.module_2_oop.sections.sec_29_interface.pojo.Credit;
import main.java.com.udemy.ltp.java_dev_bootcamp.module_2_oop.sections.sec_29_interface.repository.AccountRepository;
import main.java.com.udemy.ltp.java_dev_bootcamp.module_2_oop.sections.sec_29_interface.service.AccountService;
import main.java.com.udemy.ltp.java_dev_bootcamp.module_2_oop.sections.sec_29_interface.service.CheckingService;
import main.java.com.udemy.ltp.java_dev_bootcamp.module_2_oop.sections.sec_29_interface.service.CreditService;

import java.io.IOException;
import java.math.BigDecimal;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
	static Path[] filePaths = new Path[] {
		Paths.get("src/main/java/com/udemy/ltp/java_dev_bootcamp/module_2_oop/sections/sec_29_interface/data/accounts.txt"), 
		Paths.get("src/main/java/com/udemy/ltp/java_dev_bootcamp/module_2_oop/sections/sec_29_interface/data/transactions.txt")
	};

	static AccountRepository accountRepository = new AccountRepository();
	static CheckingService checkingService = new CheckingService(accountRepository);
	static CreditService creditService = new CreditService(accountRepository);

	private static void loadAccounts() throws IOException {
		Files.lines(filePaths[0]).forEach(account -> {
			String[] accountInfo = account.split(" ");

			if(accountInfo[0].equalsIgnoreCase(AccountType.CHECKING.toString())) {
				checkingService.createCheckingAccount(
					new Checking(
						accountInfo[1], 
						new BigDecimal(accountInfo[2])
					)
				);
			} else {
				creditService.createCreditAccount(
					new Credit(
						accountInfo[1], 
						new BigDecimal(accountInfo[2])
					)
				);
			}
		});
	}

	private static void applyTransactions() throws IOException {
		Files.lines(filePaths[1]).forEach(transaction -> {
      String[] transactionInfo = transaction.split(" ");

      Boolean isCheckingAccount = transactionInfo[0].equals(AccountType.CHECKING.toString());

      AccountService accountService = isCheckingAccount ? checkingService : creditService;

      Transaction t = Transaction.valueOf(transactionInfo[2]);

      if(t.equals(Transaction.DEPOSIT)) {
        accountService.deposit(
					transactionInfo[1], 
					new BigDecimal(transactionInfo[3])
				);
      } else {
        accountService.withdraw(
					transactionInfo[1], 
					new BigDecimal(transactionInfo[3])
				);
      }
    });
	}

	private static void test() throws IOException {
		System.out.println(
			"Account A1234B Balance: $" + checkingService.retrieveCheckingAccount("A1234B").getBalance() +
			"\nAccount E3456F Balance: $" + checkingService.retrieveCheckingAccount("E3456F").getBalance() +
			"\nAccount I5678J Balance: $" + checkingService.retrieveCheckingAccount("I5678J").getBalance() +
			"\nAccount C2345D Credit: $" + creditService.retrieveCreditAccount("C2345D").getCredit() +
			"\nAccount G4567H Credit: $" + creditService.retrieveCreditAccount("G4567H").getCredit()
		);
	}

	public static void main(String[] args) {
		try {
			loadAccounts();
			applyTransactions();
			test();
		} catch(IOException exception) {
			System.out.println(exception.getMessage());
		}
	}
}