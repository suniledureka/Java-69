package co.edureka;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		BeanFactory factory = new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("-----------------------------");
		
		Student st1 = (Student)factory.getBean("stud1");
		System.out.println(st1);
		
		Student st2 = factory.getBean("stud2", Student.class);
		System.out.println(st2);

		Student st3 = (Student)factory.getBean("stud1");
		System.out.println(st3);

		Student st4 = (Student)factory.getBean("stud1");
		System.out.println(st4);		
	}
}
