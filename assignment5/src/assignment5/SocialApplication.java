package assignment5;

public class SocialApplication {
	public String name = "Security";
	public Scheduler secSched;
	
	public SocialApplication() {
		this.secSched = new SecScheduler(this);
	}
	
	public boolean contactSec() {
		this.secSched.addEvent("current time placeholder");
		return true;
	}

}
