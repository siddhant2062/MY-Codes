//Instance variables are declared in a class, but outside a method, constructor or any block.
//Instance variables belongs to instance of a class or you can say that instance variable belongs to the object.
//Instance variable have separate value of each and every instance of the class.
/*we need an object of class to access Instance variable.
	Syntax:-
	Object.instance_variable;
*/
package lecture4_instance_and_static_variable;

class Test {
	int roll = 10;// instance variable
	int marks;// instance variable

}

class I_Instance_Variable {

	public static void main(String args[]) {
		Test obj = new Test();
		System.out.println(obj.roll);
		obj.marks = 95;
		System.out.println(obj.marks);
	}
}
