package assignment5;

import java.util.ArrayList;

public class MentalHealthSched implements Scheduler{
	public MentalHealth doctor;
	public ArrayList<String> events;
	
	public MentalHealthSched(MentalHealth doctor) {
		this.doctor = doctor;
	}
	
	public ArrayList<String> getEvents() {
		return events;
	}
	
	public void addEvent(String event) {
		this.events.add(event); //Make function to add weekly event until EOY
	}
}
