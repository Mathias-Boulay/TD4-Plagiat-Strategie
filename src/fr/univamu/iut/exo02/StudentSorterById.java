package fr.univamu.iut.exo02;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/** I realize it now by chances are that I could have made an abstract class */
public class StudentSorterById implements Comparator<Student>, IStudentSorter {

	@Override
	public void sortStudent(List<Student> students) {
		// TODO Auto-generated method stub
		Collections.sort(students, this);
	}

	@Override
	public int compare(Student o1, Student o2) {
		return o1.id - o2.id;
	}

}
