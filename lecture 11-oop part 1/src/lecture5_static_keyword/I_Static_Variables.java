//Static variables or class variables are declared in a class, but outside a method, constructor or any block. 
//The static variable can be used to refer the common property of all objects(that is not unique for each object). Static variables belongs to class not an individual object.
//Static variables is created by adding static keyword before the variable.
//static doesn't depends upon object

package lecture5_static_keyword;
class Student {
	static int roll;
	String name;

	Student(String name) {
		this.name = name;
		roll++;
		
	}
}

public class I_Static_Variables {
	public static void main(String args[]) {

		Student s1 = new Student("Siddhant");
		System.out.println("name:- " + s1.name + " and roll:- " + Student.roll);
		Student s2 = new Student("aadarsh");
		System.out.println("name:- " + s2.name + " and roll:- " + Student.roll);
		Student s3 = new Student("mohit");
		System.out.println("name:- " + s3.name + " and roll:- " + Student.roll);
	}
}
