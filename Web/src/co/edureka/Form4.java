package co.edureka;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/Form4")
public class Form4 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession();
		
		out.println("<html><body bgcolor=teal text=white>");
		
		out.println("<h2>"+session.getId()+" - "+session.isNew()+"</h2>");
		
		out.println("<h2>");
		
		Enumeration<String> names = session.getAttributeNames();
		while(names.hasMoreElements()) {
			String name = names.nextElement();
			String value = session.getAttribute(name).toString();
			out.println(name+" = "+value+"<br>");
		}
		/*
		Cookie[] cookies = request.getCookies();
		for(Cookie cookie : cookies)
		{
			String name = cookie.getName();
			String value = cookie.getValue();
			out.println(name + " = "+value+"<br>");
		}
		*/
		out.println("Salary = "+request.getParameter("t6")+"<br>");
		
		out.println("</body></html>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
