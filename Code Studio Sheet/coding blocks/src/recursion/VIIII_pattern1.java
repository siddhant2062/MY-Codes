package recursion;
import java.util.*;
public class VIIII_pattern1 {
	static void pattern(int row,int col) {
		if(row==0) {
			return;
		}
		if(row>=col) {
			System.out.print("*");
			pattern(row,++col);
		}else {
			System.out.println();
			pattern(--row,1);
		}
	}
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		int row=s.nextInt();
		pattern(row,1);
	}

}
