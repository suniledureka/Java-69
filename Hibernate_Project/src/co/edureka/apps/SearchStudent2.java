package co.edureka.apps;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import co.edureka.configs.HibernateUtils;
import co.edureka.models.Student;

public class SearchStudent2 {

	public static void main(String[] args) {
		SessionFactory sf = HibernateUtils.getSessionFactory();
		Session session = sf.openSession();
		
		Student st=new Student();
		try {
			//st = session.get(Student.class,Integer.valueOf(101));
			st = session.get(Student.class,Integer.valueOf(1015));
		}
		catch(Exception ex) {
			System.out.println(ex.toString());
		}
		if(st != null)
		  System.out.println(st);
		else
		  System.out.println("No matching student..");	
		
		
		session.close();
		sf.close();
	}

}
