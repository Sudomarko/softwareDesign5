package assignment5;

import java.util.ArrayList;

public class AcademicSched implements Scheduler{
	public AcademicApplication advisor;
	public ArrayList<String> events;
	
	public AcademicSched(AcademicApplication advisor) {
		this.advisor = advisor;
	}
		
	public ArrayList<String> getEvents() {
		return events;
	}
		
	public void addEvent(String event) {
		this.events.add(event);
	}

}
