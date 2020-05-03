package co.edureka.apps;

import java.util.List;

import javax.persistence.TypedQuery;
import org.hibernate.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import co.edureka.configs.HibernateUtils;
import co.edureka.models.Student;

public class HQLTest {

	public static void main(String[] args) throws Exception{
		SessionFactory sfactory = HibernateUtils.getSessionFactory(); 
		Session session = sfactory.openSession();
		
		//String hql = "from co.edureka.models.Student";
		/*
		String hql = "from co.edureka.models.Student where sname='Sachin'";
		TypedQuery<co.edureka.models.Student> query = session.createQuery(hql);
		*/
		
		/*
		String hql = "from co.edureka.models.Student where studid between ? and ? ";//positional parameters		
		TypedQuery<co.edureka.models.Student> query = session.createQuery(hql);
		query.setParameter(0, Integer.valueOf(101));
		query.setParameter(1, Integer.valueOf(106));
		*/
		
		String hql = "from co.edureka.models.Student where studid between :minsid and :maxsid ";//named parameters		
		TypedQuery<co.edureka.models.Student> query = session.createQuery(hql);
		query.setParameter("minsid", Integer.valueOf(105));
		query.setParameter("maxsid", Integer.valueOf(1066));
		
		List<Student> students = query.getResultList();
		for(Student st : students) {
			System.out.println(st);
			Thread.sleep(1500);
		}
		
		Transaction tx = session.beginTransaction();
		TypedQuery q = session.createQuery("update co.edureka.models.Student set sname='Sunil' where studid=101");
		int n = q.executeUpdate();
		System.out.println("No of Students updated = "+ n);
		tx.commit();
		
		session.close();
		sfactory.close();
	}
}
