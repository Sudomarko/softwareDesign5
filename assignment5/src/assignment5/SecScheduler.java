package assignment5;

import java.util.*;

public class SecScheduler implements Scheduler {
	public SocialApplication security;
	public ArrayList<String> events;
	
	public SecScheduler(SocialApplication security) {
		this.security = security;
	}
	
	public ArrayList<String> getEvents() {
		return events;
	}
	
	public void addEvent(String event) {
		this.events.add(event);
	}
}
