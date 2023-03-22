package assignment;
import java.util.Scanner;
public class assign_2 {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);

		int i=1;
		int a=s.nextInt();
		int n=s.nextInt();
		int sum_even=0;
		int sum_odd=0;
		
		while(i<=n) {
			int rem=a%10;
			if(rem%2==0) {
				sum_even=sum_even+rem;
			}else {
				sum_odd=sum_odd+rem;
			}
			
		
			
			if(i==n) {							
			System.out.println(sum_even+" "+sum_odd);
			}
		a=a/10;
			i=i+1;
			
			
		}
		
		
	}
}


