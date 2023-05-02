package assignment5;

import java.util.ArrayList;

public class AcademicSched implements Scheduler{
	public AcademicApplication advisor;
	public ArrayList<String> events  = new ArrayList<String>();
	
	public AcademicSched(AcademicApplication advisor) {
		this.advisor = advisor;
		this.events = new ArrayList<String>();
	}
		
	public ArrayList<String> getEvents() {
		return events;
	}
		
	public void addEvent(String event, String student) {
		this.events.add(event);
		System.out.println(this.advisor.advisor + " has an appointment with " + student + " on " + event + " regarding " + this.advisor.regform);
	}

}
