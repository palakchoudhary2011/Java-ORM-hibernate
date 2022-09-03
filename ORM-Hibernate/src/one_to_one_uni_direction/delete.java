package one_to_one_uni_direction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import entity.Teacher;
import entity.Teachers_Details;

public class delete {

	public static void main(String args[]) {
		
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Teacher.class).addAnnotatedClass(Teachers_Details.class).buildSessionFactory();
		Session session = factory.getCurrentSession();
		
		try {
			int id = 1;
			session.beginTransaction();
			//Teacher teacher =  session.get(Teacher.class, id);
			
			Teachers_Details details = session.get(Teachers_Details.class, id);
			System.out.println(details);
			System.out.println(details.getTeachers());
			session.delete(details);
			session.getTransaction().commit();
		}
		finally {
			factory.close();
		}
		
	}
}
