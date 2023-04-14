package assignment5;

public class HealthApp {
	public String hospitalName;
	private Scheduler hSched;
	
	public HealthApp(String name) {
		this.hospitalName = name;
		this.hSched = new DocScheduler(this);
	}
	
	
}
