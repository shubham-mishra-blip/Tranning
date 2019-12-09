

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ResponseCache;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.jdi.connect.spi.Connection;

import oracle.jdbc.driver.OracleDriver;

/**
 * Servlet implementation class GetResult
 */
public class GetResult extends HttpServlet {
	java.sql.Connection con = null;
	PreparedStatement prst;
	ResultSet res;
	
	String url = "jdbc:Oracle:thin:@//localhost:1521/xe";
	String user = "system";
	String pass = "pass";
	
	@Override
		public void init() {
		try {
			DriverManager.registerDriver(new OracleDriver());
			System.out.println("Loaded");
			con = DriverManager.getConnection(url,user,pass);
			System.out.println("Connected");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		}
	
	@Override
		protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			// TODO Auto-generated method stub
		try {
			String sql = "SELECT * FROM Student WHERE usn=?";
			String x = request.getParameter("usn");
			prst = con.prepareStatement(sql);
			prst.setString(1, x);
			res = prst.executeQuery();
			
			while (res.next() == true) {
				String name = res.getString("name");
				String usn = res.getString("usn");
				int mark1 = res.getInt("mark1");
				int mark2 = res.getInt("mark2");
				int mark3 = res.getInt("mark3");
				PrintWriter pr = response.getWriter();
				pr.println(name+" | "+usn+" | "+mark1+" | "+mark2+" | "+mark3+" | ");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		}
	@Override
	public void destroy() {
		try {
			res.close();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
