package one_to_one_uni_direction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.greatelearning.service.teacher;

import entity.Teacher;
import entity.Teachers_Details;

public class insert {

	public static void main(String args[]) {
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(teacher.class).addAnnotatedClass(Teachers_Details.class).buildSessionFactory();
		Session session = factory.getCurrentSession();
		
		try {
			Teacher teacher = new Teacher("Kamal", "Choudhary","kamal.choudhary@gmail.com");
			Teachers_Details details = new Teachers_Details("Tumsar", "Cooking");
			Teacher teacher1 = new Teacher("Prashant", "Choudhary","prashant.choudhary@gmail.com");
			Teachers_Details details1 = new Teachers_Details("Tumsar", "Drawing");
			
			teacher.setTeacherDetails(details);
			teacher1.setTeacherDetails(details1);
			
			session.beginTransaction();
			session.save(teacher);
			session.save(teacher1);
			session.getTransaction().commit();
			
			System.out.println("created");
		}
		finally {
			factory.close();
		}
	}
}
