package main.java.com.udemy.ltp.java_dev_bootcamp.module_2_oop.sections.sec_29_interface.repository;

import main.java.com.udemy.ltp.java_dev_bootcamp.module_2_oop.sections.sec_29_interface.pojo.Account;

import java.util.HashMap;
import java.util.Map;

public class AccountRepository {
	private final Map<String, Account> datastore = new HashMap<>();

	public void create(Account account) {
		this.datastore.put(account.getId(), account.clone());
	}

	public Account retrieve(String id) {
		return this.datastore.get(id).clone();
	}

	public void update(Account account) {
		this.datastore.put(account.getId(), account.clone());
	}

	public void delete(String id) {
		this.datastore.remove(id);
	}
}
