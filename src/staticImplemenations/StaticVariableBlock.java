package staticImplemenations;

class Student {
	int id;
	int pr;
	/*
	 * no need to initialize static variable (it will take default values) but we
	 * need to initialize if it is final
	 */
	static String dean;
	static final String prof;
	final String hod;
	/*
	 * static block will be executed before the object creation(using constructor)
	 * during loading class, class loads only ONCE
	 */
	static {
		prof = "Manoj";
		dean = "ayush";
		System.out.println("static block is exceuted only once and before constructor");
	}

	public Student() {
		hod = "Rajesh";
		id = 1;
		pr = 2;
		System.out.println("constructor is exceuted for every object creation");

	}

	public void show() {
		System.out.println(
				"id is =" + id + " , pr is " + pr + " , dean is " + dean + ",prof is " + prof + " and hod is " + hod);
	}
}

public class StaticVariableBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student();
		s1.id = 2;
		s1.dean = "changedRecently";
		Student s2 = new Student();

		s1.show();
		s2.show();

	}

}
