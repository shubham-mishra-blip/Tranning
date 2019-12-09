

import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.jdi.connect.spi.Connection;

import oracle.jdbc.driver.OracleDriver;

/**
 * Servlet implementation class SetResult
 */
public class SetResult extends HttpServlet {
	java.sql.Connection con = null;
	PreparedStatement prst;
	
	String url="jdbc:Oracle:thin:@//localhost:1521/xe";
	String user = "system";
	String pass = "pass";
	
	@Override
		public void init() throws ServletException {
			try {
				DriverManager.registerDriver(new OracleDriver());
				System.out.println("Loaded");
				con = DriverManager.getConnection(url,user,pass);
				System.out.println("Connected");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	
	@Override
		protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			try {
				String sql = "INSERT INTO Student VALUES(?,?,?,?,?)";				
				String name = request.getParameter("name");
				String usn = request.getParameter("usn");
				String mark1 = request.getParameter("mark1");
				int m1 = Integer.parseInt(mark1);
				String mark2 = request.getParameter("mark2");
				int m2 = Integer.parseInt(mark2);
				String mark3 = request.getParameter("mark3");
				int m3 = Integer.parseInt(mark3);
				
				prst = con.prepareStatement(sql);
				
				prst.setString(1, name);
				prst.setString(2, usn);
				prst.setInt(3, m1);
				prst.setInt(4, m2);
				prst.setInt(5, m3);
				
				int n = prst.executeUpdate();
				
				PrintWriter pw = response.getWriter();
				pw.println(n+" No of rows Updated");
				
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
}
