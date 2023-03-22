//A constructor in Java is a special method that is used to initialize objects. The constructor is called when an object of a class is created.
//A default constructor is a constructor which can be called with no arguments (either defined with an empty parameter list, or with default arguments provided for every parameter). 
package lecture7_constructor;

class Default {
	int x;// creating a class attribute
	int y;

	// Create a class constructor for the Default class
	Default() {//class name and constructor name are same
		x = 5;// Set the initial value for the class attribute x
	}

}

class Default_Constructor {
	public static void main(String args[]) {
		Default d1 = new Default();// Create an object of class Default (This will call the constructor)
		System.out.println(d1.x);
		
//		d1.Default(); constructor can be called only once when the object of that class is created.....on recalling the constructor it will fetch an error. The fact is that a constructor can run only once is an advantage as it allows you to write code that will be executed exactly once per object.
	}

}
/*
 * Note that the constructor name must match the class name, and it cannot have
 * a return type (like void, int, double,....).
 * 
 * Also note that the constructor is called when the object is created.
 * 
 * All classes have constructors by default: if you do not create a class
 * constructor yourself, Java creates one for you. However, then you are not
 * able to set initial values for object attributes.
 */
