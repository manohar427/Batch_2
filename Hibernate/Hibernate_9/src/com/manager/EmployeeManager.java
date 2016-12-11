package com.manager;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.emp.Employee;

public class EmployeeManager {
	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("com/cfg/hibernate.cfg.xml");

		SessionFactory factory = cfg.buildSessionFactory();

		Session session = factory.openSession();

		Transaction t = session.beginTransaction();

		Employee e1 = new Employee();
		e1.setId(1001);
		e1.setFirstName("Kumar");
		e1.setLastName("Rajesh");

		Employee e2 = new Employee();
		e2.setId(1002);
		e2.setFirstName("Sai");
		e2.setLastName("Tej");

		session.persist(e1);
		session.persist(e2);

		t.commit();
		session.close();
		System.out.println("successfully saved");
	}
}
