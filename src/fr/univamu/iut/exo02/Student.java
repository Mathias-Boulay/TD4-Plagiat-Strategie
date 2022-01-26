package fr.univamu.iut.exo02;

public class Student {
	private static int LAST_STUDENT_ID = 0;
	
	public int id;
	public String firstName;
	public String lastName;
	
	public Student(String firstName, String lastName) {
		id = ++LAST_STUDENT_ID;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	@Override
	public String toString() {
		return firstName + " - " + lastName + " - " + id;
	}
}
