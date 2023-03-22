// java supports a special type of method called constructor for initializing an object when it is created. This is known as automatic initialization of objects. A class constructor if defined is called whenever a program creates an object of that class.
//They are invoked directly when an object is created.
//They don't have return type, not even void and hence can't return any values.
//A constructor should have the same name as the class.
//They can't be inherited. Only members are inherited, and a constructor is not considered as a member.
//constructors cannot be abstract , final , native , static , or synchronized .
package lecture7_constructor;

class Ninja {
	Ninja(String name) {
		System.out.println("Constructor one " + name);
	}

	Ninja(String name, int age) {
		System.out.println("Constructor two " + name + " " + age);
	}

	Ninja(long id) {
		System.out.println("Constructor three " + id);
	}
}

class Constructor_Example1 {
	public static void main(String[] args) {
		Ninja n1 = new Ninja("Dharmesh", 26);
	}
}
