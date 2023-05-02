package assignment5;

public class TestSystem {

	public static void main(String[] args) {
		testAcademic();
	}
	
	public static void testAcademic() {
		AcademicApplication mvAdv = new AcademicApplication("Registration Form");
		mvAdv.advisor = "Marius Silaghi";
		Student marko = new Student("Marko", "Vukasinovic", "password", mvAdv);
		marko.schedAdvisor("October 19th 2023", "regform.txt");
	}

}
