package assignment5;

import java.util.*;

public class Student {
	public int id;
	public String firstName;
	public String lastName;
	private String password;
	public ArrayList<Organisation> organisations;
	private Scheduler sched;
	private HealthApp doctor;
	private SocialApplication security;
	public ArrayList<String> events;
	public SchedFact fact = new SchedFact();
	public MentalHealth mental;
	public AcademicApplication advisor;
	
	public Student(String firstName, String lastName, String password, AcademicApplication advisor) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;	
		this.organisations = new ArrayList<Organisation>();
		this.sched = fact.getSched(this);
		this.security = new SocialApplication();
		this.advisor = advisor;
	}
	
	public boolean editLastName(String newName) {
		this.lastName = newName;
		return true;
	}
	
	public boolean editFirstName(String newName) {
		this.firstName = newName;
		return true;
	}
	
	public void addOrg(Organisation organisation) {
		this.organisations.add(organisation);
	}
	
	public ArrayList<Organisation> getOrgs() {
		return this.organisations;
	}
	
	public ArrayList<String> getEvents() {
		ArrayList<String> result = this.sched.getEvents();
		return result;
	}
	
	public void assignDoc(HealthApp doctor) {
		this.doctor = doctor;
	}
	
	public void setDocApt(String date) {
		this.events.add(date);
		this.doctor.hSched.addEvent(date);
		System.out.println(this.doctor.hSched.getEvents()); //Filter to events that only apply to current student
	}
	
	public void alertSecurity() {
		this.security.contactSec();
	}
	
	public void confirmSecurity() {
		ArrayList<String> secEvents = this.security.secSched.getEvents();
		System.out.println(secEvents);// placeholder for algorithm to detirmine if sec is coming from their events
	}
	
	public void assignMH(MentalHealth mh) {
		this.mental = mh;
	}
	
	public void schedAdvisor(String date) {
		this.events.add(date);
		this.advisor.aSched.addEvent(date);
		System.out.println(this.advisor.aSched.getEvents()); //Filter to events that only apply to current student
	}
	
	public void setMHApt(String date) {
		this.events.add(date);
		this.mental.mSched.addEvent(date);
		System.out.println(this.mental.mSched.getEvents()); //Filter to events that only apply to current student
	}
}
