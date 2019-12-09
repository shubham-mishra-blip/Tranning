

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Validation
 */
public class Validation extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String s = request.getParameter("usn");
		if (s.length() == 7) {
			request.getServletContext().getRequestDispatcher("/GetResult").forward(request, response);
		}
		else
			response.sendRedirect("/Servlet6_Validation_2LvChaining/error.html");
	}

}
