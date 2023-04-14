package assignment5;

import java.util.ArrayList;

public class Organisation {
	public String head;
	public String[] members;
	public String position;
	public Facilities facility;
	public ArrayList<Student> students;
	public ArrayList<SocialGathering> sgs;
	
	public Organisation(String head, String[] members, String position, Facilities facility) {
		this.head = head;
		this.members = members;
		this.position = position;
		this.facility = facility;
		this.students = new ArrayList<Student>();
	}
	
	public boolean grantAccess(Student student) {
		Authentication auth = new Authentication(student);
		boolean result = auth.Authenticate();
		return result;
	}
	
	// Checks if student is authenticated, if student is, then adds student to org and vice versa
	public boolean addStudent(Student student) {
		boolean allowed = grantAccess(student);
		if (allowed) {
			this.students.add(student);
			student.addOrg(this);
			return true;
		} 
		return false;
	}
	
	public void addGathering(SocialGathering sg) {
		this.sgs.add(sg);
	}
	
	public ArrayList<SocialGathering> getGatherings() {
		return this.sgs;
	}
}
