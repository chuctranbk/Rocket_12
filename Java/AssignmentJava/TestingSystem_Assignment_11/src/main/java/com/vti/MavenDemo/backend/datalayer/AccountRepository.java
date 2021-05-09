package com.vti.MavenDemo.backend.datalayer;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


import com.vti.MavenDemo.entity.Account;
import com.vti.MavenDemo.utils.JDBCUtils;

public class AccountRepository {

	private JDBCUtils jdbcUtils;

	public AccountRepository() throws IOException {
		jdbcUtils = new JDBCUtils();
	}

	public List<Account> getListAccounts() throws SQLException, IOException, ClassNotFoundException {

		List<Account> accounts = new ArrayList<>();

		// get connection
		Connection connection = jdbcUtils.getConnection();

		// create a statement object
		String sql = "SELECT AccountId, Email, Username, FullName FROM `Account`";
		Statement statement = connection.createStatement();
		// execute query
		ResultSet resultSet = statement.executeQuery(sql);

		// Handing result set
		while (resultSet.next()) {
			Account account = new Account(resultSet.getInt("AccountId"), resultSet.getString("Email"),
					resultSet.getString("Username"), resultSet.getString("Fullname"));

			accounts.add(account);
		}

		// disconnect
		jdbcUtils.dissConnect();
		return accounts;
	}

}
