<%
 String uid = request.getParameter("uid");
 String pwd = request.getParameter("pwd");
 
 if(uid.equals("admin") && pwd.equals("123")){
	 response.sendRedirect("https://www.edureka.co");
 }
 else{
	 response.sendError(response.SC_UNAUTHORIZED, "Invalid Username / Password");
 }
%>