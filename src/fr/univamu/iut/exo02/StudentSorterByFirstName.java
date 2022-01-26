package fr.univamu.iut.exo02;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/** Class implementing a custom comparator to sort the students 
 * Maybe I should have moved out the comparator implementation, but I don't care for now */
public class StudentSorterByFirstName implements IStudentSorter, Comparator<Student> {

	@Override
	public void sortStudent(List<Student> students) {
		Collections.sort(students, this);
	}

	@Override
	public int compare(Student o1, Student o2) {
		return o1.firstName.compareTo(o2.firstName);
	}

}
