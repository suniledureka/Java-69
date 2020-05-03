<html>
<head>
 <title>JSP Page</title>
</head>
<body style="background:linear-gradient(45deg,black,darkred);color:white">
 <h1 align=center>
  <%
   out.println("edureka limited");
  %>
 </h1>
 <h3 align=center>
  <%
   out.println("Bangalore, Karnataka, India");
  %>
 </h3>
 <p style="font-size:20px">
  <%
   String name="Sunil";
   out.println("My Name = "+ name);
  %>
 </p>
</body>
</html>