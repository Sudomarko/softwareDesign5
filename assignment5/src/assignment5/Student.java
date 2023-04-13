package assignment5;

public class Student {
	public int id;
	public String firstName;
	public String lastName;
	private String password;
	
	public Student(String firstName, String lastName, String password) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;		
	}
	
	public boolean editLastName(String newName) {
		this.lastName = newName;
		return true;
	}
	
	public boolean editFirstName(String newName) {
		this.firstName = newName;
		return true;
	}
}
