package assignment;
import java.util.Scanner;
public class assignment_2_alternate {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		
		int n=s.nextInt();
		int rem;
		int sum_even=0;
		int sum_odd=0;
		
		while(n>0) {
			rem=n%10;
			if(rem%2==0) {
				sum_even=sum_even+rem;
			}else {
				sum_odd=sum_odd+rem;
			}
			n=n/10;
			}
		System.out.println(sum_even+" "+sum_odd);
			
			
		}
	}




