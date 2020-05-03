<%@page isErrorPage="true"%>
<body bgcolor=red text=cyan>
<h2>
 <%
  if(exception instanceof ArithmeticException)
	  out.println("Exception : "+ exception.toString());
  else if(exception instanceof ArrayIndexOutOfBoundsException)
	  out.println("Invalid Array Index : "+ exception.getMessage());
  else
	  out.println("Internal Server Error");
 %>
</h2>
</body>