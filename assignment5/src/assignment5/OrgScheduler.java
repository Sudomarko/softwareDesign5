package assignment5;

import java.util.*;

public class OrgScheduler implements Scheduler {
	public Student student;
	
	public OrgScheduler(Student student) {
		this.student = student;
	}
	
	public ArrayList<String> getEvents() {
		// double nested for loop which returns the events each student is signed up for
		Iterator<Organisation> it = student.organisations.iterator();
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
	
	public void addEvent(String event) {
		System.out.println("Students cant create organisation events");
	}
}
