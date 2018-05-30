import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.sql.SQLException;

public class DatabaseConnection {
	public static final String URL = "jdbc:mysql://rerun.it.uts.edu.au/sd03";
	public static final String USER = "sd03";
	public static final String PASSWORD = "84NXHUxk";
	public static final String DRIVER_CLASS = "com.mysql.jdbc.Driver";

	public int getKeys(String table) {
		int lastKey = 0;
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.exit(1);
		}
		try {
			Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
			Statement statement = connection.createStatement();
			ResultSet keys = statement.executeQuery("select * from " + table + " order by id");
			while (keys.next()) {
				lastKey = keys.getInt(1);
			}
			System.out.println("Last Key: " + lastKey);
			statement.close();
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return lastKey+1;
	}

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

	public List<Advertisement> listAdvertisement() {

		List<Advertisement> list = new ArrayList<Advertisement>();
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.exit(1);
		}
		try {
			Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
			Statement statement = connection.createStatement();
			ResultSet results = statement.executeQuery("select * from 12825612Advertisement");
			while (results.next()) {
				Advertisement ad = new Advertisement();
				ad.setID(results.getInt("id"));
				ad.setAddress(results.getString("Address"));
				//TODO compelate the cover
				list.add(ad);
			}
			statement.close();
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	
	public Advertiser findUserbyUsername(String username) {

		Advertiser ad = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.exit(1);
		}
		try {
			Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
			Statement statement = connection.createStatement();
			ResultSet results = statement.executeQuery("select * from 12825612User where username = " + username);
			while (results.next()) {
				ad = new Advertiser();
				ad.setID(results.getInt("id"));
				ad.setUsername(results.getString("username"));
				ad.setPassword(results.getString("password"));
				ad.setEmail(results.getString("email"));
				//TODO compelate the cover
			}
			statement.close();
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return ad;
	}
}
