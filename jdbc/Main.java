package co.edureka.jdbc;

import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception{
		EmployeeDAO dao = EmployeeDAOFactory.getEmployeeDAO(); 
		
		/*
		//to save an Employee
		Employee emp = new Employee(106,"Sachin",2500.5f);
		dao.saveEmp(emp);
		*/
		
		/*
		//to update an Employee
		Employee emp = new Employee(101,"Sunil Joseph",5500.5f);
		dao.updateEmp(emp);
		*/
		
		Scanner sc = new Scanner(System.in);
		/*
		//to delete an Employee
		System.out.print("enter employee no to delete: ");
		int eno = sc.nextInt();
		dao.deleteEmp(eno);
		*/
		
		/*
		//to search an Employee
		System.out.print("enter employee no: ");
		int eno = sc.nextInt();
		Employee emp = dao.getEmployee(eno);
		if(emp != null)
			System.out.println(emp);
		else
			System.out.println("No Matching Employee Found!");
		*/
		
		List<Employee> emps = dao.getEmployees();
		for(Employee e : emps) {
			System.out.println(e); //toString()
			Thread.sleep(2000);
		}
	}
}
