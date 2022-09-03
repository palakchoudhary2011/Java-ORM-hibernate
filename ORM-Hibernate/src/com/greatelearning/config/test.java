package com.greatelearning.config;


import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import entity.Teacher;

public class test {

	public static void main1(String args[]) {
		System.out.println("Project started");
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = null;
		
		Teacher t1 = new Teacher("Palak", "Choudhary", "palak.choudhary.201194@gamil.com");
		Teacher t2 = new Teacher("Roshan", "Ingle", "roshaningle@gamil.com");
		Teacher t3 = new Teacher("Piyu", "Choudhary", "piyu.choudhary1441@gamil.com");
		Teacher t4 = new Teacher("Atul", "Choudhary", "atul.choudhary@gamil.com");
		
		try {
			session = factory.getCurrentSession();
			Transaction tran = session.beginTransaction();
			// insert into table
			// session.save(t1);
			// session.save(t2);
			// session.save(t3);
			// session.save(t4);
			
			// get from table
			// Teacher teacher = session.get(Teacher.class, 1);
			
			//get teachers tavle list
			// List<Teacher> teachers = session.createQuery("from Teacher").list();
			// for( Teacher teacher: teachers)
			//	System.out.println(teacher);
			
			// update 
			 // Teacher teacher = session.get(Teacher.class, 1);
			 //teacher.setF_name("plk");
			
			// delete
			Teacher teacher = session.get(Teacher.class, 1);
			session.delete(teacher);
			tran.commit();
		}
		catch(Exception ex) {
			System.out.println(ex);
		}
		finally {
			session.close();
		}
		System.out.println("created");
 	}
}
