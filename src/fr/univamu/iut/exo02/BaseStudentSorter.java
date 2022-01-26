package fr.univamu.iut.exo02;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/** I KNEW IT ! Anyway, I guess what I did works so I won't care 
 * Also, yes the IStudent sorter add an unnecessary layer to the program */
public abstract class BaseStudentSorter implements Comparator<Student>, IStudentSorter {

	@Override
	public void sortStudent(List<Student> students) {
		// TODO Auto-generated method stub
		Collections.sort(students, this);
	}

	@Override
	abstract public int compare(Student o1, Student o2);
}
