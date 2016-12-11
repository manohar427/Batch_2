package com.test.main;

import java.util.Iterator;
import java.util.List;

import org.hibernate.HibernateException;
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
		//getEmployeeList(session);
		//updateEmployee(session);
		//getEmployeeList(session);
		//System.out.println("After Deletion:");
		deleteEmployee(session);
		getEmployeeList(session);

		t.commit();
		session.close();

		System.out.println("successfully saved");
	}

	private static void getEmployeeList(Session session) {
		List employees = session.createQuery("FROM Employee").list();
		for (Iterator iterator = employees.iterator(); iterator.hasNext();) {
			Employee employee = (Employee) iterator.next();
			System.out.print("First Name: " + employee.getFirstName());
			System.out.print("  Last Name: " + employee.getLastName());
			System.out.println("  ID: " + employee.getId());
		}
	}

	public static void updateEmployee(Session session) {
		try {

			Integer id = 2;
			Employee employee = (Employee) session.get(Employee.class, id);
			employee.setFirstName("Lori2");
			employee.setLastName("Mac2");
			session.update(employee);
		} catch (HibernateException e) {
			e.printStackTrace();
		}
	}

	public static void deleteEmployee(Session session) {
		try {
			int empid = 21327;
			Employee employee = (Employee) session.get(Employee.class, empid);
			session.delete(employee);
		} catch (HibernateException e) {
		}
	}
}