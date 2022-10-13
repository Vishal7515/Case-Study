package Utility;

import java.sql.Connection;
import java.sql.DriverManager;

public class databaseHandler {
	public static Connection establishConnection() {
		Connection connection=null;
		try
		{
		Class.forName("org.postgresql.Driver");
		 connection=DriverManager.getConnection("jdbc:postgresql://localhost:5432/HolidayPackage","postgres","Vishu@4455");
		
		
		
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		return connection;
	}
}
