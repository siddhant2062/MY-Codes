package lecture9_fraction_class;
import java.util.Scanner;
public class Simplify_Main {
	private static Scanner s;

	public static void main(String args[]) {
		s = new Scanner(System.in);
		Simplify obj=new Simplify(s.nextInt(),s.nextInt());
		obj.print();
		
		
	}

}
