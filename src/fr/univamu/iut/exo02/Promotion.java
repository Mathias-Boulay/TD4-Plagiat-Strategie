package fr.univamu.iut.exo02;

import java.util.ArrayList;

public class Promotion {
	// Meh, still lazy with getter setters
	public ArrayList<Student> students;
	public IStudentSorter studentSorter;
	
	public Promotion() {
		// Just fill with default students
		students = new ArrayList<>(5);
		students.add(new Student("Harry", "Potter"));
		students.add(new Student("Pierre", "Jouvelain"));
		students.add(new Student("SPSE", "Gamertag"));
		students.add(new Student("Jizz", "FFTA"));
		students.add(new Student("Test", "FTTA"));
	}
	
	// TODO 
	public void sortById() {
		studentSorter = new StudentSorterById();
		studentSorter.sortStudent(students);
	}

	public void sortByFirstName() {
		studentSorter = new StudentSorterByFirstName();
		studentSorter.sortStudent(students);
	}
	
	public void sortByLastName() {
		studentSorter = new StudentSorterByLastName();
		studentSorter.sortStudent(students);
	}
	
	@Override
	public String toString() {
		return students.toString();
	}
	
	
}
