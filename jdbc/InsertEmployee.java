package co.edureka.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertEmployee {

	public static void main(String[] args) throws Exception {
		 Class.forName("com.mysql.jdbc.Driver");
		 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/edureka","root","");
		 		 
		 Statement st = con.createStatement();
		 
		 //String sql = "insert into emp values(101,'Sunil',2500.5)";
		 String sql = "insert into emp values(102,'Anil',5500.5),(103,'Rahul',123.45),(104,'Praveen',6500.50),(105,'Naveen',7800.5)";
		 try {
			 int affected_rows = st.executeUpdate(sql);
			 System.out.println("Employees Saved = "+ affected_rows);
		 }
		 catch(Exception ex) {
			 System.out.println("Exception : "+ex.getMessage());
		 }
		 
		 st.close();
		 con.close();
	}
}
