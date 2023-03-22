package loops;

import java.util.Scanner;

public class function_of_function_prime_from_1_to_n {

	public static boolean is_prime(int n) {
		int i=2;
		int temp=0;
		while(i<=n-1) {
			if(n%i==0) {
				temp=temp+1;
			}
			i++;
				
			}
		if(temp==0) {
			return true;			
		}else {
			return false;
		}
	}
	public static void print_prime(int n) {
		for(int i=2;i<=n;i++) {
			boolean a=is_prime(i);
			if(a) {
				System.out.println(i);
			}
		}
	}
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		
		int n=s.nextInt();
	   print_prime(n);
	}

}


