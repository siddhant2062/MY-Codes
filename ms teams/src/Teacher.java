
import java.util.Scanner;



 class Teacherr {
	Scanner s = new Scanner(System.in);
	String name = s.nextLine();
	int roll = s.nextInt();

}

public class Teacher {/*
					 * A Java source file can have only one class declared as public, we cannot put
					 * two or more public classes together in a . java file. This is because of the
					 * restriction that the file name should be same as the name of the public class
					 * with .java extension. If we want to multiple classes under consideration are
					 * to be declared as public, we have to store them in separate source files and
					 * attach the package statement as the first statement in those source files.
					 */

	public static void main(String args[]) {
		Teacherr t1 = new Teacherr();

		String name = t1.name;
		int roll_no = t1.roll;
		System.out.println(name + " " + roll_no);
	}
}
