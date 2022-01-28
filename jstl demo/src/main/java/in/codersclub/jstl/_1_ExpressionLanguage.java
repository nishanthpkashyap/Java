package in.codersclub.jstl;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class _1_DemoServlet
 */
@WebServlet("/_1_DemoServlet")
public class _1_ExpressionLanguage extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
       
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("html");
		String name = request.getParameter("name");
		request.setAttribute("name", name);
		RequestDispatcher rd = request.getRequestDispatcher("1)display.jsp");
		rd.forward(request, response);
	}

}
