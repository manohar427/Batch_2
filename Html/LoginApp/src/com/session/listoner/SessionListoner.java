package com.session.listoner;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class SessionListoner implements HttpSessionListener {

	int sessionCount = 0;

	public SessionListoner() {
		System.out.println(" I am from SessionListoner()");
	}

	public void sessionCreated(HttpSessionEvent arg0) {
		System.out.println(" I am from SessionCreated()");
		++sessionCount;
		System.out.println("New Session Created:" + sessionCount);
	}

	public void sessionDestroyed(HttpSessionEvent arg0) {
		System.out.println(" I am from sessionDestroyed()");
		--sessionCount;
		System.out.println("Session Got removed:" + sessionCount);
	}

}
