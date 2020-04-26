package co.edureka.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateTableMySQL {

	public static void main(String[] args) throws Exception
	{
	 Class.forName("com.mysql.jdbc.Driver");
	 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/edureka","root","");
	 System.out.println("--- connected to edureka db ---");
	 
	 Statement st = con.createStatement();
	 
	 String sql = "create table emp(empno int(5), ename varchar(30), sal float(10,2), primary key(empno))";
	 try {
		 st.execute(sql);
		 System.out.println("DB Table Created!");
	 }
	 catch(Exception ex) {
		 System.out.println("Exception : "+ex.getMessage());
	 }
	 
	 st.close();
	 con.close();
	}
}
