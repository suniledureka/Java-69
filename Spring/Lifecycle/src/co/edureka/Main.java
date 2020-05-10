package co.edureka;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		
		System.out.println("-------------------------");
		Student st1 = (Student)context.getBean("stud1");
		System.out.println(st1);
		
		Student st2 = (Student)context.getBean("stud2");
		System.out.println(st2);
		System.out.println("-------------------------");
		
		((ConfigurableApplicationContext)context).close();
	}
}
