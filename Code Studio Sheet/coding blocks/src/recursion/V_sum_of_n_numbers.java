package recursion;
import java.util.*;
public class V_sum_of_n_numbers {
	static int sum(int n) {
		if(n==1) {
			return 1;
		}
		return n+sum(n-1);
	}
public static void main(String args[]) {
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	System.out.println(sum(n));
}
}
