<!--  declaration block-->
<%!
 String username, password;
%>
<h2>
<%
 username = request.getParameter("uid");
 password = request.getParameter("pwd");
 
 out.println("User Name = "+ username+"<br>");
 out.println("Password = "+ password);
%>
<hr>
 Server Name : <%=request.getServerName() %> <br>
 Server Port : <%=request.getServerPort() %> <br>
 Method : <%=request.getMethod() %> <br>
 Protocol : <%=request.getProtocol() %> <br>
 Content Type : <%=request.getContentType() %> <br>
 Content Length : <%=request.getContentLength() %>
</h2>