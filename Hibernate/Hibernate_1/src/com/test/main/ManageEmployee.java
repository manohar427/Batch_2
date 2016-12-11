package com.test.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.test.emp.Employee;

public class ManageEmployee {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("com/test/cfg/hibernate.cfg.xml");

		SessionFactory factory = cfg.buildSessionFactory();

		Session session = factory.openSession();

		Transaction t = session.beginTransaction();

		Employee e1 = new Employee();
		e1.setId(21325);
		e1.setFirstName("XXXXX");
		e1.setLastName("YYYYY");

		session.save(e1);

		t.commit();
		session.close();

		System.out.println("successfully saved");
	}
}