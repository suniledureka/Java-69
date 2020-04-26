package co.edureka.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Types;

public class ProcedureCall {

	public static void main(String[] args) throws Exception {
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","java69","password"); 
		
		CallableStatement cst = con.prepareCall("{call addNum(?,?,?)}");
		
		int x = 12, y = 34;
		cst.setInt(1, x);
		cst.setInt(2, y);
		
		cst.registerOutParameter(3, Types.INTEGER);
		
		cst.execute();
		int sum = cst.getInt(3);
		System.out.println(x+" + "+y+" = "+sum);
		
		cst.close();
		con.close();
	}
}
