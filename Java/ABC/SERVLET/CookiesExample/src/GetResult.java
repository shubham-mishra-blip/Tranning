

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
				
				//Cookies operation start from here
				//1st Step
				Integer i1 = new Integer(mark1);
				Integer i2 = new Integer(mark2);
				Integer i3 = new Integer(mark3);
				
				//2nd Step
				String s1 = i1.toString();
				String s2 = i2.toString();
				String s3 = i3.toString();
				
				
				//3rd Step
				Cookie ck1 = new Cookie("Mark1",s1);
				Cookie ck2 = new Cookie("Mark1",s2);
				Cookie ck3 = new Cookie("Mark1",s3);
				
				//4th Step
				ck1.setMaxAge(60);
				ck2.setMaxAge(60*2);
				ck3.setMaxAge(60*3);
				
				//5th step
				response.addCookie(ck1);
				response.addCookie(ck2);
				response.addCookie(ck3);
				
				PrintWriter pr = response.getWriter();
				pr.println("<h1> "+name+" | "+usn+" | "+mark1+" | "+mark2+" | "+mark3+" | </h1>");
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
