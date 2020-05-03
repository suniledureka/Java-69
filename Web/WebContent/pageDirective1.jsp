<%@page import="java.util.Date" %> 
<h2 align=center>
<%!
  Date today = null;
%>
<% 
  today = new Date();
  out.println(today);
%>
</h2>