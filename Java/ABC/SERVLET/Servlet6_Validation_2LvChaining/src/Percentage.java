

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Percentage
 */
public class Percentage extends HttpServlet {
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		String name = (String)session.getAttribute("name");
		String usn = (String)session.getAttribute("usn");
		int mark1 = (int)session.getAttribute("mark1");
		int mark2 = (int)session.getAttribute("mark2");
		int mark3 = (int)session.getAttribute("mark3");
		
		float per = (float)(mark1+mark2+mark3)/3;
		
		PrintWriter pw = response.getWriter();
		pw.println("Name: "+name+"\nUSN: "+usn+"\nMark1: "+mark1+"\nMark2: "+mark2+"\nMark3: "+mark3+" \n Percentage: "+per);
	}
}
