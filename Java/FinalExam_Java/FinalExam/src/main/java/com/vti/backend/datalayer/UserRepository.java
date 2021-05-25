package com.vti.backend.datalayer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.vti.entity.Employee;
import com.vti.entity.Manager;
import com.vti.entity.Role;
import com.vti.entity.User;
import com.vti.utils.JdbcUtils;

public class UserRepository implements IUserRepository {
	private JdbcUtils jdbcUtils;
	private Connection connection;

	public UserRepository() throws ClassNotFoundException, FileNotFoundException, SQLException, IOException {

		jdbcUtils = new JdbcUtils();
		connection = jdbcUtils.Connect();

	}

	public List<User> getListUser() throws SQLException {

		List<User> users = new ArrayList<User>();
		String sql = "SELECT * FROM User";
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery(sql);
		while (resultSet.next()) {
			int userID = resultSet.getInt("IDUser");
			String fullName = resultSet.getString("FullName");
			String email = resultSet.getString("Email");
			String password = resultSet.getString("PassWord");
			Role role = Role.valueOf(resultSet.getString("Role"));

			User user = new User(userID, fullName, email, password, role);
			users.add(user);

		}

		return users;
	}

	public User login(String email, String password) throws Exception {
		User user=null;
		String sql = "SELECT * FROM User " + "WHERE Email = ? AND Password = ? ";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);

		preparedStatement.setString(1, email);
		preparedStatement.setString(2, password);

		ResultSet resultSet = preparedStatement.executeQuery();

		while (resultSet.next()) {
			int userId = resultSet.getInt("IDUser");
			String fullName = resultSet.getString("FullName");
			Role role = Role.valueOf(resultSet.getString("Role"));
			user = new User(userId, fullName, email, password, role);
//			return user;
		}
		return user;

	}

	public List<User> getListManagerOfProject() throws SQLException {
		List<User> users = new ArrayList<User>();
		Statement statement = connection.createStatement();

		String listUser = "SELECT * from `user` u  LEFT JOIN `project`  p On u.Projectid = p.ProjectId WHERE u.`role` = 'Manager';";
		ResultSet resultSet = statement.executeQuery(listUser);

		while (resultSet.next()) {
			int userID = resultSet.getInt("IDUser");
			String fullName = resultSet.getString("FullName");
			String email = resultSet.getString("Email");
			String password = resultSet.getString("PassWord");
			Role role = Role.valueOf(resultSet.getString("Role"));

			User user = new User(userID, fullName, email, password, role);
			users.add(user);

		}

		return users;
	}

	public List<User> getEmployeeManagerByNameProject(String name) throws SQLException {
		List<User> users = new ArrayList<User>();
		String sql = "Select * from `user` WHERE ProjectName =? ";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		preparedStatement.setString(0, name);
		ResultSet resultSet = preparedStatement.executeQuery();
		while (resultSet.next()) {
			int userID = resultSet.getInt("IDUser");
			String fullName = resultSet.getString("FullName");
			String email = resultSet.getString("Email");
			String password = resultSet.getString("PassWord");
			Role role = Role.valueOf(resultSet.getString("Role"));
			

			User user = new User(userID, fullName, email, password, role);
			users.add(user);
		}

		return users;
	}

	public boolean isProjectExists(String name) throws SQLException {
		String sql = "SELECT *  FROM Project WHERE ProjectName = ?";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		preparedStatement.setString(2, name);
		ResultSet resultSet = preparedStatement.executeQuery();
//		if (resultSet.next()) {
//			return true;
//		} else {
//			return false;
//		}
		
		return  (resultSet.next());
	}

	public boolean checkLogin(String email, String password) throws SQLException {
		String sql = "SELECT * FROM `user` WHERE Email = ? AND `password` = ?  ";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);

		preparedStatement.setString(1, email);
		preparedStatement.setString(2, password);

		ResultSet resultSet = preparedStatement.executeQuery();
		return  (resultSet.next());
	}


}
