package com.vti.MavenDemo.frontend;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.vti.MavenDemo.backend.presentationlayer.AccountController;
import com.vti.MavenDemo.backend.presentationlayer.DepartmentController;
import com.vti.MavenDemo.entity.Account;
import com.vti.MavenDemo.entity.Department;

public class Program {
	private static DepartmentController depController;
	public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
		depController = new DepartmentController();
		showDepartmentList();
		int id = 1;
		String name = "lesson11";
		updateDepartmentNameById(id,name);
		
		AccountController accountController = new AccountController();

		List<Account> accounts = accountController.getListAccounts();

		for (Account account : accounts) {
			System.out.println(account);
		}
		
	}
	private static void updateDepartmentNameById(int id, String name) {
		depController.updateDepartmentNameById(id,name);
		
	}
	private static void showDepartmentList() {
		List<Department> depts = depController.showDepartmentList();
		for (Department dept : depts) {
			System.out.println(dept.toString());
		}
	}
	
}
