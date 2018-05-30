import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;

public class DatabaseConnection {
	public static final String URL = "jdbc:mysql://rerun.it.uts.edu.au/sd03";
	public static final String USER = "sd03";
	public static final String PASSWORD = "84NXHUxk";
	public static final String DRIVER_CLASS = "com.mysql.jdbc.Driver";

	public boolean executeSql(String sql) {
		boolean results = false;
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.exit(1);
		}
		try {
			Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
			Statement statement = connection.createStatement();
			results = statement.execute(sql);
			statement.close();
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return results;
	}

	public ResultSet executeQuery(String sql) {
		ResultSet results = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.exit(1);
		}
		try {
			Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
			Statement statement = connection.createStatement();
			results = statement.executeQuery(sql);
			statement.close();
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return results;
	}
}
