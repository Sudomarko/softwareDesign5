package assignment5;

import java.util.ArrayList;

public class AcademicApplication {
	public String form;
	public Scheduler aSched;
	public boolean approved = true;
	public String advisor = "Advisor Name";
	public String regform = "empty";
	
	public AcademicApplication(String form) {
		this.form = form;
		this.aSched = new AcademicSched(this);
	}
	
	public ArrayList<String> getEvents() {
		return aSched.getEvents();
	}
}
