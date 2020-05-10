package co.edureka;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		
		EmployeeDAO dao = (EmployeeDAO)context.getBean("edao");
		
		/*
		Employee emp = new Employee(110,"Vivek",25000.5f);
		dao.saveEmp(emp);
		*/
		
		/*
		Employee emp = new Employee(102,"Anil Kumar",25000.5f);
		dao.updateEmp(emp);
		*/
		
		//dao.deleteEmp(109);
		
		List<Employee> emps = dao.getEmployees();
		for(Employee emp : emps) {
			System.out.println(emp);
			try {
				Thread.sleep(2000);
			}catch(Exception ex) {}
		}
	}
}
