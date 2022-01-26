package fr.univamu.iut.exo02;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentSorterByLastName implements Comparator<Student>, IStudentSorter {

	@Override
	public void sortStudent(List<Student> students) {
		// TODO Auto-generated method stub
		Collections.sort(students, this);
	}

	@Override
	public int compare(Student o1, Student o2) {
		return o1.lastName.compareTo(o2.lastName);
	}

}
