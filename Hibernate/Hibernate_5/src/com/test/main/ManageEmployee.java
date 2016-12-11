package com.test.main;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.test.emp.Cart;
import com.test.emp.Items;

public class ManageEmployee {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("com/test/cfg/hibernate.cfg.xml");

		SessionFactory factory = cfg.buildSessionFactory();

		Session session = factory.openSession();

		Transaction t = session.beginTransaction();

		Cart cart = new Cart();
		cart.setName("MyCart");
		
		Items item1 = new Items("I1", 10, 1, cart);
		Items item2 = new Items("I2", 20, 2, cart);
		Set<Items> itemsSet = new HashSet<Items>();
		itemsSet.add(item1); 
		itemsSet.add(item2);
		
		cart.setItems(itemsSet);
		cart.setTotal(10*1 + 20*2);
		session.save(cart);
		session.save(item1);
		session.save(item2);
		t.commit();
		session.close();

		System.out.println("successfully saved");
	}

}