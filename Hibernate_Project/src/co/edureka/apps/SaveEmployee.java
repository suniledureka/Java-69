package co.edureka.apps;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import co.edureka.configs.HibernateUtils;
import co.edureka.models.Employee;

public class SaveEmployee {

	public static void main(String[] args) {
		
		SessionFactory sfactory = HibernateUtils.getSessionFactory();
		
		Session session = sfactory.openSession();
		Transaction tx = session.beginTransaction();
		
		Employee emp = new Employee(101,"Sunil Joseph",2500.5f);
		
		session.save(emp);
		System.out.println("------------------------");
		
		tx.commit();
		System.out.println("Employee Saved!");
		
		session.close();
		sfactory.close();		
	}
}
