import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;

public class Customer {
	public static final String URL = "jdbc:mysql://rerun.it.uts.edu.au/sd03";
    public static final String USER = "sd03";
    public static final String PASSWORD = "84NXHUxk";
    public static final String DRIVER_CLASS = "com.mysql.jdbc.Driver";
   	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
	        Class.forName("com.mysql.jdbc.Driver");
	    } catch (ClassNotFoundException e) {
	        e.printStackTrace();
	        System.exit(1);
	    }
	    try
	    {
	    	Connection connection = DriverManager.getConnection(URL,USER,PASSWORD );
	    	Statement statement = connection.createStatement();
	     
	    	ResultSet results = statement.executeQuery("SELECT * FROM Customer");
	    	int customerId =0;
	    	String customerName="";
	    	String customerAddress="";
	    	String customerGender="";
	    	System.out.println("Id\tName\tAddress\tGender");
	    	while(results.next())
	    	{
	    		customerId = results.getInt("CustomerId");
	    		customerName = results.getString("CustomerName");
	    		customerAddress = results.getString("CustomerAddress");
	    		customerGender = results.getString("CustomerGender");
	    		System.out.println(customerId+"\t"+customerName+"\t"+customerAddress+"\t"+customerGender);
	       	}
	    	results.close();
	    	statement.close();
	    	connection.close();
	    }
	    catch(SQLException e) {
	    	e.printStackTrace();
	    }
	    	
	    

	}

}
