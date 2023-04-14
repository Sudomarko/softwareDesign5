package assignment5;

import java.util.*;

public class Student {
	public int id;
	public String firstName;
	public String lastName;
	private String password;
	public ArrayList<Organisation> organisations;
	
	
	public Student(String firstName, String lastName, String password) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;	
		this.organisations = new ArrayList<Organisation>();
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
		// double nested for loop which returns the events each student is signed up for
		Iterator<Organisation> it = organisations.iterator();
		ArrayList<String> result = new ArrayList<String>();
		String temp;
		while(it.hasNext()) {
			Organisation org = it.next();
			Iterator<SocialGathering> itSC = org.getGatherings().iterator();
			while(itSC.hasNext()) {
				temp = itSC.next().event;
				result.add(temp);
				System.out.println(temp);
			}
		}
		return result;
	}
}
