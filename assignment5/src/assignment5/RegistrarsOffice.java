package assignment5;

import java.util.*;

public class RegistrarsOffice {
	public ArrayList<Student> students;
	
	public RegistrarsOffice() {
		this.students = new ArrayList<Student>();
	}
	
	public void addStudent(Student student) {
		this.students.add(student);
	}
	
	public ArrayList<Student> getStudents() {
		return this.students;
	}
}
