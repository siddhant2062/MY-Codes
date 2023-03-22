package loops;
import java.util.Scanner;
public class function_check_prime_no {
	public static boolean isprime(int n) {
		int i=2;
		int temp=0;
		while(i<=n-1) {
			if(n%i==0) {
				temp++;
			}
			i++;
		}
			if(temp==0) {
				return true;
			}else {
			
			
		
		return false;
			}
	}
		public static void main(String args[]) {
			Scanner s=new Scanner(System.in);
			int n=s.nextInt();
			
			boolean a=isprime(n);
			System.out.print(a);
	     } 		
			
		}
	


