package com.HibernateDemo;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();

		// creating student
		Student st = new Student();
		st.setId(103);
		st.setName("abhishak");
		st.setCity("Indore");
		System.out.println(st);

		// creating address
		Address ad = new Address();
		ad.setStreet("Street1");
		ad.setCity("Delhi");
		ad.setIsOpen(true);
		ad.setAddedDate(new Date());
		ad.setX(1234.34);

		// session
		Session session = factory.openSession();
		session.beginTransaction();
		Transaction tx = session.getTransaction();

		// save
		session.save(st);
		session.save(ad);

		tx.commit();
		session.close();
		System.out.println("Done..");

		System.out.println(factory);
		System.out.println(factory.isClosed());

	}
}
