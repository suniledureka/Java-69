<%@page errorPage="handler.jsp" %>
<%!
 int x=10,y=10,z=0;
 int[] marks = new int[6];
%>
<h2>
<%
 z = x/y;
 out.println(x+" / "+y+" = "+z+"<br>");
 out.println(marks[10]);
%>
</h2>