<h2>
<%
 //String uname = request.getParameter("uid");
 String uname = pageContext.getAttribute("uid",PageContext.SESSION_SCOPE).toString();
 out.println("Hello, "+ uname);
%>
</h2>