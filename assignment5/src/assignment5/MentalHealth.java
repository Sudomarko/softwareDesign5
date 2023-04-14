package assignment5;

import java.util.ArrayList;

public class MentalHealth {
	public String instName;
	public Scheduler mSched;
	public SchedFact fact = new SchedFact();
	public MentalHealth(String name) {
		this.instName = name;
		this.mSched = fact.getSched(this);
	}
	
	public ArrayList<String> getEvents() {
		return mSched.getEvents();
	}
}
