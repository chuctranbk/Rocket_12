package com.vti.MavenDemo;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import com.mysql.cj.xdevapi.PreparableStatement;

public class Program {
	public static void main(String[] args) throws ClassNotFoundException, SQLException, FileNotFoundException, IOException {
		getUpdateTesting_Category(3, "Javacore");
	}

	public static void getUpdateTesting_Category(int id, String name) throws ClassNotFoundException, SQLException, FileNotFoundException, IOException {
		Properties properties = new Properties();
		
		properties.load(new FileInputStream("src/main/resource/Database.property"));
		String url = properties.getProperty("url");
		String user = properties.getProperty("name");
		String password = properties.getProperty("password");
		// register the driver class with DriverManager
		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection connection = null;
		try {
			// tạo kết nối đến database
			connection = DriverManager.getConnection(url, name, password);

			// tạo Statement để chạy chương trình

			// tạo câu truy vấn
			String sql = "UPDATE testing_category SET name = ? WHERE id = ?";
			PreparedStatement pre = connection.prepareStatement(sql);
			pre.setInt(2, id);
			pre.setString(1, name);
			int record = pre.executeUpdate();
			if(record == 1) {
				System.out.println("update successfully");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			connection.close();
		}
	}

}
