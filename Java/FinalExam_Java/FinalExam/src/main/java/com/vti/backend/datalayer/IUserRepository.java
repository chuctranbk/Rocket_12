package com.vti.backend.datalayer;

import java.sql.SQLException;
import java.util.List;

import com.vti.entity.User;

public interface IUserRepository {

	List<User> getListUser() throws SQLException;

	User login(String email, String password) throws Exception;

	List<User> getListManagerOfProject() throws SQLException;


	boolean checkLogin(String email, String password) throws SQLException;

	List<User> getEmployeeManagerByNameProject(String name) throws SQLException;

	boolean isProjectExists(String name) throws SQLException;
}
