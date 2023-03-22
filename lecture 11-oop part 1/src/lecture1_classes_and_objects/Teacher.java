//here we will call teacher object inside one file only
package lecture1_classes_and_objects;

import java.util.Scanner;

class Features { /*
					 * A Java source file can have only one class declared as public, we cannot put
					 * two or more public classes together in a . java file. This is because of the
					 * restriction that the file name should be same as the name of the public class
					 * with .java extension. If we want to multiple classes under consideration are
					 * to be declared as public, we have to store them in separate source files and
					 * attach the package statement as the first statement in those source files.
					 */
	Scanner s = new Scanner(System.in);
	String name = s.nextLine();
	int roll = s.nextInt();

}

public class Teacher {//this class is called main class which is also the file name i.e.,Teacher.java.

	public static void main(String args[]) { //public static void are mandatory in main() method.....which we will learn later
		Features f1 = new Features();

		String name = f1.name;
		int roll_no = f1.roll;
		System.out.println(name + " " + roll_no);
	}
}
