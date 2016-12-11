package com.test.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.test.emp.Student;

public class ManageEmployee {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("com/test/cfg/hibernate.cfg.xml");

		SessionFactory factory = cfg.buildSessionFactory();

		Session session = factory.openSession();

		Transaction t = session.beginTransaction();

		Student student = new Student();
        student.setStudentId(107);
        student.setStudentAddress("Delhi");
        student.setStudentName("Try");
        student.setCourceId(210);

		session.save(student);

		t.commit();
		session.close();

		System.out.println("successfully saved");
	}
}