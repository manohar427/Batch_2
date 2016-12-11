package com.login;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class SessionCreateListoner implements HttpSessionListener {

	int sessionCount = 0;

	public SessionCreateListoner() {
	}

	public void sessionCreated(HttpSessionEvent arg0) {
		++sessionCount;
		System.out.println("Session Count(sessionCreated):" + sessionCount);
	}

	public void sessionDestroyed(HttpSessionEvent arg0) {
		--sessionCount;
		System.out.println("Session Count(sessionDestroyed):" + sessionCount);
	}

}
