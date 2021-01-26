package staticImplemenations;
/* Here we have created instance of singleton in static initializer. 
 * JVM executes static initializer when the class is loaded and 
 * hence this is guaranteed to be thread safe. Use this method only
 *  when your singleton class is light and is used throughout the 
 *  execution of your program.
 * */

public class EagerStaticInitializerSingletoDesignPattern {

	// create an object of SingleObject
	// Static initializer based Java implementation of
	// singleton design pattern
	private static EagerStaticInitializerSingletoDesignPattern instance = new EagerStaticInitializerSingletoDesignPattern();

	// make the constructor private so that this class cannot be
	// instantiated
	private EagerStaticInitializerSingletoDesignPattern() {
	}

	// Get the only object available
	public static EagerStaticInitializerSingletoDesignPattern getInstance() {
		return instance;
	}

	public void showMessage() {
		System.out.println("Hello World!");
	}

}
