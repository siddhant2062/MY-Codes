package Assignment;
import java.util.Scanner;
public class reverse_of_a_no {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		
		int n=s.nextInt();
		int rem=0;
		int rev=0;
		while(n>0) {
			rem=n%10;
			rev=(rev*10)+rem;
			n=n/10;
		}
			System.out.print(rev);
			
			
		
	}

}
