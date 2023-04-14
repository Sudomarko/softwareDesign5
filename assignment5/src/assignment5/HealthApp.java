package assignment5;

import java.util.ArrayList;

public class HealthApp {
	public String hospitalName;
	public Scheduler hSched;
	
	public HealthApp(String name) {
		this.hospitalName = name;
		this.hSched = new DocScheduler(this);
	}
	
	public ArrayList<String> getEvents() {
		return hSched.getEvents();
	}
	
}
