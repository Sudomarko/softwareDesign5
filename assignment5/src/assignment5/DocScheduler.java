package assignment5;

import java.util.ArrayList;

public class DocScheduler implements Scheduler{
	public HealthApp doctor;
	
	public DocScheduler(HealthApp doctor) {
		this.doctor = doctor;
	}
	
	public ArrayList<String> getEvents() {
		return new ArrayList<String>();
	}
	
}
