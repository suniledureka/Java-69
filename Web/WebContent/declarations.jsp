<%!
 String firstName = "Sunil";
 public int addNum(int x, int y){
	  int s = x+y;
	  return s;
 }
%>
<h2>
<%
 out.println("My Name is "+ firstName+"<br><br>");
 out.println("Sum = "+ addNum(11,24));
%>
</h2> 