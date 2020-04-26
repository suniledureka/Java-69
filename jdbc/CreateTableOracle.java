package co.edureka.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateTableOracle {

	public static void main(String[] args) throws Exception {
		//initialize an appropriate JDBC driver 
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		//connect to DB Server
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","java69","password");
		
		//create a provision for passing SQL to connected DB
		Statement st = con.createStatement();
		
		try {
			String sql = "create table emp(empno number(5),ename varchar(30), sal number(10,2),primary key(empno))";
			st.execute(sql);
			System.out.println("DB Table Created!");
		}
		catch(Exception ex) {
			System.out.println("Error: "+ ex.toString());
		}
		//close connection with DB
		st.close();
		con.close();
	}
}
