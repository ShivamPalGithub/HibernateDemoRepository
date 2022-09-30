package com.HibernateDemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmDemo {
	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		
		Student student1=new Student();
		student1.setId(14134);
		student1.setName("shivam pal");
		student1.setCity("indore");
		
		Certificate certificate=new Certificate();
		certificate.setCourse("Andriod");
		certificate.setDuration("2 month");
		
		student1.setCertificate(certificate);
		
		
		Session s=factory.openSession();
		Transaction tx=s.beginTransaction();
		
//		s.save(student1);

		Student student = (Student) session.get(Student.class, 104);

		System.out.println(student);
		
		tx.commit();
		s.close();
		factory.close();
	}

}
