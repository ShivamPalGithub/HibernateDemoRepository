package com.HibernateDemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchDemo {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();

		Student student = (Student) session.get(Student.class, 101);
		Student student2 = (Student) session.get(Student.class, 102);
		Student student3 = (Student) session.get(Student.class, 103);

		System.out.println(student);
		System.out.println(student2);
		System.out.println(student3);

	}

}
