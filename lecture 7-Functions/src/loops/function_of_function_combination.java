package loops;

import java.util.Scanner;

public class function_of_function_combination {
	public static int factorial(int n) {
		
		int fact=1;
		for(int i=1;i<=n;i++) {
			fact=fact*i;			
		}
		return fact;
	}
	public static int ncr(int n,int r) {
		
		int fact1=factorial(n);
		int fact2=factorial(r);
		int fact3=factorial(n-r);
		
		int fact=fact1/(fact2*fact3);
		return fact;
	}
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		
		int n=s.nextInt();
		int r=s.nextInt();
		
		int combination=ncr(n,r);
		System.out.println(combination);
	}

}
