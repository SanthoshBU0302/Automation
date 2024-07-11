package base;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.testng.annotations.Test;

public class Data {
	@Test
	public void data() throws Exception {
		String usn = "root";
		String psw = "root";
		String url = "jdbc:mysql://localhost:3306/Selenium";
		Connection connect = DriverManager.getConnection(url, usn, psw);
		Statement query = connect.createStatement();
		boolean req = query.execute("select * from StudentDetails");
		ResultSet res1 = query.executeQuery("select * from StudentDetails");
		while (res1.next()) {
			String name = res1.getString("Names");
			System.out.println(name);	
		}
		
	}

}
