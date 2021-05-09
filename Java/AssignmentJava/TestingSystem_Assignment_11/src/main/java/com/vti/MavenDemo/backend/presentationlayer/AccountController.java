package com.vti.MavenDemo.backend.presentationlayer;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.vti.MavenDemo.backend.businesslayer.AccountService;
import com.vti.MavenDemo.entity.Account;

public class AccountController {

	private AccountService service;

	public AccountController() throws IOException {
		service = new AccountService();
	}

	public List<Account> getListAccounts() throws SQLException, IOException, ClassNotFoundException {
		return service.getListAccounts();
	}
}
