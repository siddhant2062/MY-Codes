package recursion_1;
import java.util.*;
public class VIII_permutation_of_a_string {
	static void odd(int n) {
		if(n==0) {
			return;
		}
		if(n%2!=0) {
			System.out.println(n);
			odd(--n);
		}
	}
	static void even(int i,int n) {
		if(i>n) {
			return;
		}
		if(i%2==0) {
			System.out.println(i);
			even(++i,n);
		}
	}
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
//		odd(n);
//		even(1,n);
		String str1="9";
		String str2="98";
		
		System.out.println(str1.compareTo(str2));
	}
}
