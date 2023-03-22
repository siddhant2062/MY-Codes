//Instance method can access instance variables and instance methods directly.
//Instance methods can access static methods and variables directly.
//you cannot call an instance method in static method directly so instance method can be invoked using object of class.
//Instance methods can call an instance methods directly. There is no need to use of object.
package lecture4_instance_and_static_variable;

class Test1 {

	int a = 10;// instance variable
	int b = 20;// instance variable

	void add() {// instance method
		System.out.println(a + b);// accessing instance variables directly in instance method.
	}

	static void multiply() { // static method
		/* System.out.println(a + b); *//*
										 * it will give an error because we cannot access instance variables inside an
										 * static method. To access instance variables inside static method we have to
										 * create an object.
										 */
		Test1 obj = new Test1();
		System.out.println(obj.a * obj.b);

	}

}

class II_Instance_Method {
	public static void main(String args[]) {
		Test1 obj = new Test1();
		obj.add();
		Test1.multiply();/*
							 * as multiply() method is an static method and static keyword means it belongs
							 * to its class. So, it should be called by its class name.
							 */
	}
}
