package assignment5;

public class SchedFact {
	public Scheduler getSched(Object schedType){
		if (schedType == null) {
			return null;
		} else if (schedType instanceof Student) {
			return new OrgScheduler((Student) schedType);
		} else if (schedType instanceof HealthApp) {
			return new DocScheduler((HealthApp) schedType);
		} else if (schedType instanceof SocialApplication) {
			return new SecScheduler((SocialApplication) schedType);
		} else if (schedType instanceof AcademicApplication) {
			// return AcademicApplicationSched
		} else if (schedType instanceof MentalHealth) {
			// return MentalHealthSched
		} 
		return null;
	}
}
