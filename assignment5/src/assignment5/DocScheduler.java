package assignment5;

import java.util.ArrayList;

public class DocScheduler implements Scheduler{
	public HealthApp hospital;
	public ArrayList<String> events;
	
	public DocScheduler(HealthApp hospital) {
		this.hospital = hospital;
		this.events = new ArrayList<String>();
	}
	
	public ArrayList<String> getEvents() {
		return events;
	}
	
	public void addEvent(String event, String student) {
		this.events.add(event);
		System.out.println(this.hospital.hospitalName + " recieved an appointment from " + student + " on " + event);
	}
}
