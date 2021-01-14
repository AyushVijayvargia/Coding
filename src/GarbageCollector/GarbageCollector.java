package GarbageCollector;

/**
 * We can make objects eligible for GC by making it unreachable , gc MAY take it and 
 * it call finalize on it before deleting... we can request (only request) jvm to run
 * GC by the following two methods.... which will call finalize to perform cleanup 
 * operations on it, if finalize is complete(called) then gc destroys the object.....
 * 
 */

/**
 * @author Ayush
 *
 */
public class GarbageCollector {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GarbageCollector t1 = new GarbageCollector();
		GarbageCollector t2 = new GarbageCollector();

		// Nullifying the reference variable
		t1 = null;

		// requesting JVM for running Garbage Collector
		System.gc();

		// Nullifying the reference variable
		t2 = null;

		// requesting JVM for running Garbage Collector
		Runtime.getRuntime().gc();

	}

	protected void finalize() throws Throwable {
		System.out.println("Garbage collector called");
		System.out.println("Object garbage collected : " + this);
	}

}
