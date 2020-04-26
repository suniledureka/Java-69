package co.edureka;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/admin")
public class AdminServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
	 //type of response to be given by the servlet
	 response.setContentType("text/html");
	 PrintWriter out = response.getWriter();
	 
	 out.println("<html><body bgcolor=teal text=white>");
	 out.println("<h2 align=center>edureka | admin section</h2>");
	 out.println("<img src=images/edureka1.jpg style=display:block;margin:auto;width:100px>");
	 out.println("<hr>");
	 out.println("<p style=font-size:20px>Hello, "+request.getParameter("uid")+"</p>");
	 out.println("</body></html>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
