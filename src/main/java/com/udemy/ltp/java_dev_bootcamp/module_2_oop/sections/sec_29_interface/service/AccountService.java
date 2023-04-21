package main.java.com.udemy.ltp.java_dev_bootcamp.module_2_oop.sections.sec_29_interface.service;

import java.math.BigDecimal;

public interface AccountService {
  public void deposit(String accountId, BigDecimal amount);
  public void withdraw(String accountId, BigDecimal amount);      
}