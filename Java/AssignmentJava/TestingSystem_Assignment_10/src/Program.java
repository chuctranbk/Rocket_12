import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.xdevapi.PreparableStatement;

public class Program {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		getUpdateTesting_Category(3, "Javacore");
	}

	public static void getUpdateTesting_Category(int id, String name) throws ClassNotFoundException, SQLException {
		String url = "jdbc:mysql://localhost:3306/TestingSystem?autoReconnect=true&useSSL=false&characterEncoding=latin1";
		String username = "root";
		String password = "123456789";

		// register the driver class with DriverManager
		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection connection = null;
		try {
			// tạo kết nối đến database
			connection = DriverManager.getConnection(url, username, password);

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
