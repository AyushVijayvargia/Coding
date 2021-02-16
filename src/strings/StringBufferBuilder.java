package strings;

/*
 * If a string is going to remain constant throughout the program, then use String class object because a String object is immutable.
If a string can change (example: lots of logic and operations in the construction of the string) and will only be accessed from 
a single thread, using a StringBuilder is good enough.
If a string can change, and will be accessed from multiple threads, 
use a StringBuffer because StringBuffer is synchronous so you have thread-safety.
 */
public class StringBufferBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "Geeks";

		// conversion from String object to StringBuffer
		StringBuffer sbr1 = new StringBuffer(str1);
		sbr1.reverse();
		System.out.println(sbr1);

		// conversion from String object to StringBuilder
		StringBuilder sbl1 = new StringBuilder(str1);
		sbl1.append("ForGeeks");
		System.out.println(sbl1);

		StringBuffer sbr2 = new StringBuffer("Geeks");
		StringBuilder sbdr2 = new StringBuilder("Hello");

		// conversion from StringBuffer object to String
		String str2 = sbr2.toString();
		System.out.println("StringBuffer object to String : ");
		System.out.println(str2);

		StringBuffer sbr3 = new StringBuffer("Geeks");

		// conversion from StringBuffer object to StringBuilder
		String str3 = sbr3.toString();
		StringBuilder sbl3 = new StringBuilder(str3);

		System.out.println(sbl3);
		System.out.println("Reverse using sbr " + sbl3.reverse());
		System.out.println("Reverse using sbl " + sbr3.reverse());
		System.out.println("Concat using sbbr " + sbl3.append("for"));
		System.out.println("Concat using sbl " + sbr3.append("for"));

	}

}
