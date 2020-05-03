package co.edureka.apps;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import co.edureka.configs.HibernateUtils;
import co.edureka.models.Student;

public class SaveStudents {

	public static void main(String[] args) {
		SessionFactory sf = HibernateUtils.getSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		
		Scanner sc = new Scanner(System.in);
		
		String req = "Y";
		while(req.equalsIgnoreCase("Y")) {
			System.out.println("enter name, email & mobile");
			String name = sc.next();
			String email = sc.next();
			String mobile = sc.next();
			Student st = new Student(name,email,mobile);
			session.save(st);
			
			System.out.print("More Students to Save [Y/N]: ");
			req = sc.next();
		}
		System.out.println("---------------------------------");
		tx.commit();
		
		sc.close();
		session.close();
		sf.close();
	}
}
