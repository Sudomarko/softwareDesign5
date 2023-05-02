package assignment5;

public class TestSystem {

	public static void main(String[] args) {
		testAcademic();
		testHealth();
		testSocial();
	}
	
	public static void testAcademic() {
		// Create advisor
		AcademicApplication mvAdv = new AcademicApplication();
		mvAdv.advisor = "Marius Silaghi";
		// Create student, no student can be without advisor so advisor has to be provided
		Student marko = new Student("Marko", "Vukasinovic", "password", mvAdv);
		// Schedule an appointment between student and advisor with a submitted registration form
		marko.schedAdvisor("October 19th 2023", "regform.txt");
	}
	
	public static void testHealth() {
		// Create student with advisor
		AcademicApplication mvAdv = new AcademicApplication();
		mvAdv.advisor = "Marius Silaghi";
		Student marko = new Student("Marko", "Vukasinovic", "password", mvAdv);
		// Create healthApp class that is linked to a hospital
		HealthApp leafEmergencyCare = new HealthApp("Leaf Emergency Care");
		// Assign hospital to student
		marko.assignHosp(leafEmergencyCare);
		// Set doctor appointment with date and doc name
		marko.setDocApt("January 5th 2024");
	}
	
	public static void testSocial() {
		// Create student with advisor
		AcademicApplication mvAdv = new AcademicApplication();
		mvAdv.advisor = "Marius Silaghi";
		Student marko = new Student("Marko", "Vukasinovic", "password", mvAdv);
		// Student alerts security, only one security on campus so class is initialized with student creation
		marko.alertSecurity();
	}
}
