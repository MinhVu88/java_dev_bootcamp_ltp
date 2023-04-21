package main.java.com.udemy.ltp.java_dev_bootcamp.module_2_oop.sections.sec_29_interface.service;

import java.math.BigDecimal;

import main.java.com.udemy.ltp.java_dev_bootcamp.module_2_oop.sections.sec_29_interface.pojo.Checking;
import main.java.com.udemy.ltp.java_dev_bootcamp.module_2_oop.sections.sec_29_interface.repository.AccountRepository;

public class CheckingService implements AccountService {
  private AccountRepository accountRepository;

  public CheckingService(AccountRepository accountRepository) {
    this.accountRepository = accountRepository;
  }        

  public void createCheckingAccount(Checking account) {
		this.accountRepository.create(account);
	}

	public Checking retrieveCheckingAccount(String id) {
		return (Checking) this.accountRepository.retrieve(id);
	}

	public void updateCheckingAccount(Checking account) {
		this.accountRepository.update(account);
	}

	public void deleteCheckingAccount(String id) {
		this.accountRepository.delete(id);
	}

  @Override
  public void deposit(String accountId, BigDecimal amount) {
    Checking checking = retrieveCheckingAccount(accountId);
    checking.setBalance(checking.getBalance().add(amount));
    updateCheckingAccount(checking);
  }

  @Override
  public void withdraw(String accountId, BigDecimal amount) {
    Checking checking = retrieveCheckingAccount(accountId);
    checking.setBalance(checking.getBalance().subtract(amount));
    updateCheckingAccount(checking);
  }
}
