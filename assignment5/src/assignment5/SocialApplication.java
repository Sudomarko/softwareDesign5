package assignment5;

public class SocialApplication {
	public String name = "Security";
	public Scheduler secSched;
	
	public SocialApplication() {
		this.secSched = new SecScheduler(this);
	}
	
	public boolean contactSec(String student) {
		this.secSched.addEvent("current time placeholder", student);
		return true;
	}

}
