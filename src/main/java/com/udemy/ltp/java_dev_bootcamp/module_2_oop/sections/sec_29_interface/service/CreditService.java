package main.java.com.udemy.ltp.java_dev_bootcamp.module_2_oop.sections.sec_29_interface.service;

import java.math.BigDecimal;

import main.java.com.udemy.ltp.java_dev_bootcamp.module_2_oop.sections.sec_29_interface.pojo.Credit;
import main.java.com.udemy.ltp.java_dev_bootcamp.module_2_oop.sections.sec_29_interface.repository.AccountRepository;

public class CreditService implements AccountService {
  private AccountRepository accountRepository;

  public CreditService(AccountRepository accountRepository) {
    this.accountRepository = accountRepository;
  }

  public void createCreditAccount(Credit account) {
		this.accountRepository.create(account);
	}

	public Credit retrieveCreditAccount(String id) {
		return (Credit) this.accountRepository.retrieve(id);
	}

	public void updateCreditAccount(Credit account) {
		this.accountRepository.update(account);
	}

	public void deleteCreditAccount(String id) {
		this.accountRepository.delete(id);
	}

  @Override
  public void deposit(String accountId, BigDecimal amount) {
    Credit credit = retrieveCreditAccount(accountId);
    credit.setCredit(credit.getCredit().subtract(amount));
    updateCreditAccount(credit);
  }

  @Override
  public void withdraw(String accountId, BigDecimal amount) {
    Credit credit = retrieveCreditAccount(accountId);
    credit.setCredit(credit.getCredit().add(amount));
    updateCreditAccount(credit);
  }
}
