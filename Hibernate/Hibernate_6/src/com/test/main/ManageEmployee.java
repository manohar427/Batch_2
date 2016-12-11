package com.test.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.test.group.Group;
import com.test.group.User;

public class ManageEmployee {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("com/test/cfg/hibernate.cfg.xml");

		SessionFactory factory = cfg.buildSessionFactory();

		Session session = factory.openSession();

		Transaction t = session.beginTransaction();

		Group groupAdmin = new Group("Admin Group");
		Group groupGuest = new Group("Guest Group");
		Group groupUser = new Group("User Group");

		User user1 = new User("Kumar", "hsaytd7awdb", "Kumar@email.com");
		User user2 = new User("Rajesh", "23dds21sdf", "Rajesh@email.com");
		User user3 = new User("Shankar", "Hja8sh21sdf", "Shakar@email.com");

		groupAdmin.addUser(user1);
		groupAdmin.addUser(user2);
		groupAdmin.addUser(user3);
		groupUser.addUser(user3);
		groupUser.addUser(user2);
		groupGuest.addUser(user1);

		user1.addGroup(groupAdmin);
		user2.addGroup(groupAdmin);
		user3.addGroup(groupAdmin);
		user3.addGroup(groupUser);
		user2.addGroup(groupAdmin);
		user3.addGroup(groupUser);

		session.save(groupAdmin);
		session.save(groupGuest);
		session.save(groupUser);


		t.commit();
		session.close();

		System.out.println("successfully saved");
	}
}