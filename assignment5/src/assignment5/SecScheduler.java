package assignment5;

import java.util.*;

public class SecScheduler implements Scheduler {
	public SocialApplication security;
	public ArrayList<String> events;
	
	public SecScheduler(SocialApplication security) {
		this.security = security;
		this.events = new ArrayList<String>();
	}
	
	public ArrayList<String> getEvents() {
		return events;
	}
	
	public void addEvent(String event, String student) {
		this.events.add(event);
		System.out.println(this.security.name + " has been alerted by " + student + " at " + event);
	}
}
