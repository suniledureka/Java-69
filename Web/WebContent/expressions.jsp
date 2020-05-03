<%!
 String firstName = "Sunil";
 public int addNum(int x, int y){
	  int s = x+y;
	  return s;
 }
%>
<h2>
My Name is <%=firstName %>
<hr>
<%="Sum = "+ addNum(10,20) %>
</h2> 