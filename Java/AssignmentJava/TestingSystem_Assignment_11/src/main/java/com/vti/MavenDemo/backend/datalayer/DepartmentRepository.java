package com.vti.MavenDemo.backend.datalayer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.vti.MavenDemo.entity.Department;
import com.vti.MavenDemo.utils.JDBCUtils;
import com.vti.MavenDemo.utils.properties.MessageProperties;

public class DepartmentRepository implements IDepartmentRepository {
	private JDBCUtils jdbcutils;
	private MessageProperties mesProperties;
	

	public DepartmentRepository() throws FileNotFoundException, IOException {
		jdbcutils = new JDBCUtils();
		mesProperties = new MessageProperties();
	}

	@Override
	public List<Department> getDepartmentList() throws SQLException {
		List<Department> departments = new ArrayList<Department>();
		// step1: connect database
		jdbcutils.Connect();

		// step2:
		Connection connection = jdbcutils.getConnection();
		String sql = "SELECT*FROM `Department`";
		Statement statement = connection.createStatement();
		// step3:Execute query
		ResultSet resultSet = statement.executeQuery(sql);
		while (resultSet.next()) {
			int id = resultSet.getInt(1);
			String name = resultSet.getString(2);
			Department d = new Department(id, name);
			departments.add(d);
		}
		jdbcutils.dissConnect();
		return departments;
	}

	@Override
	public void updateDepartmentNameById(int id, String name) throws SQLException {
		jdbcutils.Connect();
		Connection connection = jdbcutils.getConnection();
		String sql="UPDATE `Department` SET Department_Name=?where Department_Id=?";
		PreparedStatement preparedstatements = connection.prepareStatement(sql);
		preparedstatements.setString(1, name);
		preparedstatements.setInt(2, id);
		int count=preparedstatements.executeUpdate();
		if(count>0) {
			System.out.println(""+count);
		}else {
			System.out.println("");
		}
		
	}
}
