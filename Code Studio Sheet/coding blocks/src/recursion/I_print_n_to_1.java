package recursion;
import java.util.*;
public class I_print_n_to_1 {
	static void print(int n) {
		if(n==0) {
			return;
		}
		System.out.println(n);
		print(n-1);
	}
public static void main(String args[]) {
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	print(n);
}
}
