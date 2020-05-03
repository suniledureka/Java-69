<h2>
<%
 String uname = request.getParameter("uid");
 pageContext.setAttribute("uid", uname, PageContext.SESSION_SCOPE);
 out.println("Hello, "+ uname);
%>
</h2>
<a href="pageContext2.jsp">Next Page</a>