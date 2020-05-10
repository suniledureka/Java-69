package co.edureka;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

public class EmployeeDAOImpl implements EmployeeDAO {
	private JdbcTemplate jt;
	
	public JdbcTemplate getJt() {
		return jt;
	}

	public void setJt(JdbcTemplate jt) {
		this.jt = jt;
	}

	@Override
	public void saveEmp(Employee emp) {
		String sql = "insert into emp values("+emp.getEmpno()+",'"+emp.getEname()+"',"+emp.getSal()+")";
		int n = jt.update(sql);
		if(n>0)
			System.out.println("Employee Inserted!");
	}

	@Override
	public void updateEmp(Employee emp) {
		String sql = "update emp set ename='"+emp.getEname()+"',sal = "+emp.getSal()+" where empno="+emp.getEmpno();
		int n = jt.update(sql);
		if(n>0)
			System.out.println("Employee Updated");
	}	
	

	@Override
	public void deleteEmp(int eno) {
		String sql = "delete from emp where empno="+eno;
		int n = jt.update(sql);
		if(n>0)
			System.out.println("Employee Deleted!");	
	}

	@Override
	public List<Employee> getEmployees() {
		
		String sql = "select * from emp";
		List<Employee> emps = jt.query(sql,new ResultSetExtractor<java.util.List<Employee>>(){
			@Override
			public List<Employee> extractData(ResultSet rs) throws SQLException, DataAccessException {
				List<Employee> l = new ArrayList<>();
				while(rs.next()) {
				    Employee e=new Employee();  
				    e.setEmpno(rs.getInt(1));  
				    e.setEname(rs.getString(2));  
				    e.setSal(rs.getFloat(3));  
				    l.add(e);
				}
				return l;
			}			
		});
		return emps;
	}

}
