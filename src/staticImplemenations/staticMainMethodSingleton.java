package staticImplemenations;

public class staticMainMethodSingleton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// illegal constructor
		// Compile Time Error: The constructor SingleObject() is not visible
		// SingletoDesignPattern object1 = new SingletoDesignPattern();

		// Get the only object available
		EagerStaticInitializerSingletoDesignPattern object = EagerStaticInitializerSingletoDesignPattern.getInstance();

		// show the message
		object.showMessage();

	}

}
