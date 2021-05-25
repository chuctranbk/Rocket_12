/**
 * 
 */
package com.vti.backend.presentationlayer;

import java.util.List;

import com.vti.backend.businesslayer.IUserService;
import com.vti.backend.businesslayer.UserService;
import com.vti.entity.User;

public class UserController {

	private IUserService service;

	public UserController() {
		service = new UserService();

	}

	public List<User> getListUser() {
		// TODO Auto-generated method stub
		return service.getListUser();
	}

	public void login(String email, String password) {
		// TODO Auto-generated method stub
		service.login(email, password);

	}

	public List<User> getListManagerOfProject() {
		// TODO Auto-generated method stub
		return service.getListManagerOfProject();
	}

	public boolean isProjectExists(String name) {
		// TODO Auto-generated method stub
		return service.isProjectExists(name);
	}

	public  boolean checkLogin(String email, String password) {
		return service.checkLogin(email,password);
	}

	public List<User> getEmployeeManagerByNameProject(String name) {
		// TODO Auto-generated method stub
		return null;
	}
}
