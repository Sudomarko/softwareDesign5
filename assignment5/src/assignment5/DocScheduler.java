package assignment5;

import java.util.ArrayList;

public class DocScheduler implements Scheduler{
	public HealthApp doctor;
	public ArrayList<String> events;
	
	public DocScheduler(HealthApp doctor) {
		this.doctor = doctor;
	}
	
	public ArrayList<String> getEvents() {
		return events;
	}
	
	public void addEvent(String event, String student) {
		this.events.add(event);
	}
}
