
import java.sql.*;

import com.sun.jdi.connect.spi.Connection;

import oracle.jdbc.driver.OracleDriver;

public class Fetch_Data {
	public static void main(String ...args) {
		java.sql.Connection connection = null;
		PreparedStatement ptmt;
		ResultSet res;
		
		
		String url = "jdbc:Oracle:thin:@//localhost:1521/xe";
		String user = "system";
		String pass = "pass";
		//load Driver
		try {
			DriverManager.registerDriver(new OracleDriver());
			System.out.println("Loaded Driver");
			connection = DriverManager.getConnection(url,user,pass);
			System.out.println("Connectioned");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			String sql = "SELECT * FROM Student WHERE name=?";
			String x = "Amit";
			ptmt = connection.prepareStatement(sql);
			ptmt.setString(1, x);
			res = ptmt.executeQuery();
			
			while (res.next() == true) {
				String name = res.getString("name");
				String usn = res.getString("usn");
				int mark1 = res.getInt("mark1");
				int mark2 = res.getInt("mark2");
				int mark3 = res.getInt("mark3");
				
				System.out.println(name+" | "+usn+" | "+mark1+" | "+mark3+" | "+mark3+" | ");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
