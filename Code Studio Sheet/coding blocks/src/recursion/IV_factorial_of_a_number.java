package recursion;
import java.util.*;
public class IV_factorial_of_a_number {
	static int fact(int n) {
		if(n==0) {
			return 1;
		}
		return n*fact(n-1);
	}
public static void main(String args[]) {
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	System.out.println(fact(n));
}
}
