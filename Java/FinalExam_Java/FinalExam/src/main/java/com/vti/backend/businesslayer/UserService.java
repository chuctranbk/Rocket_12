package com.vti.backend.businesslayer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.vti.backend.datalayer.IUserRepository;
import com.vti.backend.datalayer.UserRepository;
import com.vti.entity.User;

public class UserService implements IUserService {

	private IUserRepository repository;

	public UserService() {
		try {
			repository = new UserRepository();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public List<User> getListUser() {
		// TODO Auto-generated method stub
		try {
			return repository.getListUser();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public void login(String email, String password) {
		// TODO Auto-generated method stub
		try {
			repository.login(email, password);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public List<User> getListManagerOfProject() {
		// TODO Auto-generated method stub
		try {
			return repository.getListManagerOfProject();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public List<User> getEmployeeManagerByNameProject(String name) {
		// TODO Auto-generated method stub
		try {
			return repository.getEmployeeManagerByNameProject(name);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public boolean checkLogin(String email, String password) {
		// TODO Auto-generated method stub
		try {
			return repository.checkLogin(email, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	public boolean isProjectExists(String name) {
		try {
			return repository.isProjectExists(name);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		return false;
	}

	public List<User> getEmployeeManagerByIDProject(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
