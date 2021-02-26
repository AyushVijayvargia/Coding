package immutableClass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class ImmutableStudentClass {

	// StringBuilder firstname = new StringBuilder("ayush");--> no need

	final String firstname;
	final int age;
	final List<Integer> marks = new ArrayList<>();

	public String getFirstname() {
		return firstname;
	}

	public int getAge() {
		return age;
	}

	// sending the main arraylist to the check student client
	public List<Integer> getMarks() {
		final List<Integer> marks2 = new ArrayList<>();
		for (int i = 0; i < marks.size(); i++) {
			marks2.add(marks.get(i));
		}

		return marks2;
	}

	// making two different reference for two arraylists

	public ImmutableStudentClass(String firstname, int age, List<Integer> marks) {
		this.firstname = firstname;
		this.age = age;

		for (int i = 0; i < marks.size(); i++) {
			this.marks.add(marks.get(i));
		}

		System.out.println(firstname + "   " + age + "  " + marks);
	}

}
