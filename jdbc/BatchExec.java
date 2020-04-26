package co.edureka.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class BatchExec {

	public static void main(String[] args) throws Exception{
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","java69","password");
		
		Statement st = con.createStatement();
		
		con.setAutoCommit(false);
		
		st.addBatch("insert into emp values(101,'Sunil',2500)");
		st.addBatch("insert into emp values(102,'Anil',5500)");
		//st.addBatch("insert into emp values(101,'Sanjay',7500)");
		st.addBatch("insert into emp values(103,'Sanjay',7500)");
		st.addBatch("update emp set sal = 5250.50");
		
		try {
			st.executeBatch();
			System.out.println("Batch Execution Success!");
			con.commit();
		}
		catch(Exception ex) {
			System.out.println(ex);
			con.rollback();
		}
		
		st.close();
		con.close();
		
	}
}
