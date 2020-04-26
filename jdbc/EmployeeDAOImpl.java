package co.edureka.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDAOImpl implements EmployeeDAO {
	private static Statement st=null;
	
	//constructor
	public EmployeeDAOImpl() throws Exception{
		Connection con = ConnectionFactory.getConnection();
		st = con.createStatement();
	}
	@Override
	public void saveEmp(Employee emp) throws Exception {	
		String sql = "insert into emp values("+emp.getEmpno()+",'"+emp.getEname()+"',"+emp.getSal()+")";
		System.out.println("insert query = "+ sql);
		
		int n = st.executeUpdate(sql);
		if(n>0)
			System.out.println("Employee Saved!");
	}

	@Override
	public void updateEmp(Employee emp) throws Exception {
		String sql = "update emp set ename ='"+emp.getEname()+"', sal="+emp.getSal()+" where empno = "+emp.getEmpno();
		System.out.println("update query = "+sql);
		int n = st.executeUpdate(sql);
		if(n>0)
			System.out.println("Employee Updated!");	
	}

	@Override
	public void deleteEmp(int eno) throws Exception {
		String sql = "delete from emp where empno="+eno;
		System.out.println("deletequery = "+sql);
		int n = st.executeUpdate(sql);
		if(n>0)
			System.out.println("Employee Deleted");
		else
			System.out.println("No Matching Employee to Delete!");
	}

	@Override
	public Employee getEmployee(int eno) throws Exception {
			Employee emp = null;
			String sql = "select ename,sal from emp where empno="+eno;
			System.out.println("Retrieve Query = "+sql);
			ResultSet rs = st.executeQuery(sql);
			if(rs.next()) {
				emp = new Employee();
				emp.setEmpno(eno);
				emp.setEname(rs.getString(1));
				emp.setSal(rs.getFloat(2));
				
				//emp = new Employee(eno, rs.getString(1),rs.getFloat(2));
			}
			return emp;
	}

	@Override
	public List<Employee> getEmployees() throws Exception {
		List<Employee> emps = new ArrayList<>();
		String sql = "select * from emp";
		ResultSet rs = st.executeQuery(sql);
		while(rs.next()) {
			//Employee emp = new Employee(rs.getInt("empno"),rs.getString(2),rs.getFloat(3));
			Employee emp = new Employee();
			emp.setEmpno(rs.getInt(1));
			emp.setEname(rs.getString(2));
			emp.setSal(rs.getFloat(3));
			emps.add(emp);
		}
		return emps;
	}
}
