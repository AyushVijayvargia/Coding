package immutableClass;

import java.util.ArrayList;
import java.util.List;

public class StudentClassImmutabilityCheck {

	public static void main(String[] args) {

		List<Integer> marks = new ArrayList<>();
		marks.add(1);
		ImmutableStudentClass s1 = new ImmutableStudentClass("AYUSH", 26, marks);
		marks.add(3);// solve this
		System.out.println("The list is not changed even after fetching it in this class " + s1.getMarks());
		s1.getMarks().add(2);

		System.out.println("The list is not changed even after fetching it from immutable class " + s1.getMarks());

	}

}
