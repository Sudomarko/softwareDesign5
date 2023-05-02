package assignment5;
import java.util.Calendar;
import java.text.SimpleDateFormat;


public class SocialApplication {
	public String name = "Security";
	public Scheduler secSched;
	public static final String DATE_FORMAT_NOW = "HH:mm:ss";
	
	public SocialApplication() {
		this.secSched = new SecScheduler(this);
	}
	
	public boolean contactSec(String student) {
		this.secSched.addEvent(this.now(), student);
		return true;
	}
	
	public static String now() {
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT_NOW);
		return sdf.format(cal.getTime());
	}

}
