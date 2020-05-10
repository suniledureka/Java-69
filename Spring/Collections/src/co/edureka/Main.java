package co.edureka;

import java.util.Iterator;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		
		Databases db = (Databases)context.getBean("db");
		
		List<String> dbnames = db.getDbNames();
		System.out.println(dbnames);
		
		Iterator<String> it = dbnames.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
