//A static method belongs to class rather than object of a class.
//A static method can be invoked without an object of the class.
//Static method can access static data member and can change the value of it.
//The static method can not use non-static data member 
//this and super cannot be used in static context.

package lecture5_static_keyword;

class Student1 {
	static private int num_of_student;

	Student1() {
		num_of_student++;
	}

	static int getnumstudent() {
		return num_of_student;
	}
}


class II_Static_method {
	public static void main(String args[]) {

		Student1 s1 = new Student1();
		System.out.println(Student1.getnumstudent());
		Student1 s2 = new Student1();
		System.out.println(Student1.getnumstudent());

	}
}
