package co.edureka.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class PreparedTest {

	public static void main(String[] args) throws Exception{
		Connection con = ConnectionFactory.getConnection();
		
		PreparedStatement pst = con.prepareStatement("insert into emp values(?,?,?)");
		
		Scanner sc = new Scanner(System.in);
		
		String req = "Y";
		while(req.equalsIgnoreCase("Y"))
		{
			System.out.println("enter employee no, name & salary:");
			int eno = sc.nextInt();
			sc.nextLine();
			String name = sc.nextLine();
			float sal = sc.nextFloat();
			
			pst.setInt(1, eno);
			pst.setString(2, name);
			pst.setFloat(3, sal);
			
			int n = pst.executeUpdate();
			System.out.println("employee saved : "+n);
			
			System.out.print("do you have more employees [Y/N]: ");
			req=sc.next();
		}
	}
}
