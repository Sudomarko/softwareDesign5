package assignment5;

public class Authentication {
	public Student student;
	
	public Authentication(Student student) {
		this.student = student;
	}
	
	public String getName() {
		String firstName = this.student.firstName;
		String lastName = this.student.lastName;
		
		String result = firstName + " " + lastName;
		return result;
	}
	
	public boolean Authenticate() {
		boolean auth = true;
		return auth;
	}
}
