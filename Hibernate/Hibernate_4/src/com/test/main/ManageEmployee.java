package com.test.main;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.test.emp.Author;
import com.test.emp.Book;

public class ManageEmployee {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("com/test/cfg/hibernate.cfg.xml");

		SessionFactory factory = cfg.buildSessionFactory();

		Session session = factory.openSession();

		Transaction t = session.beginTransaction();

		Book newBook = new Book();
		newBook.setTitle("Servlets");
		newBook.setDescription("Servlets");
		newBook.setPublishedDate(new Date());

		Author auth = new Author();
		auth.setName("Joe Chandy");
		auth.setEmail("Joe@email.com");
		newBook.setAuthor(auth);

		Long bookId = (Long) session.save(newBook);

		t.commit();
		session.close();

		System.out.println("successfully saved:"+bookId);
	}
}