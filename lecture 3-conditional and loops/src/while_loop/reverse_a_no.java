package while_loop;
import java.util.Scanner;
public class reverse_a_no {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		
		int n=s.nextInt();
		int rem;
		int rev=0;
		
		
		while(n>0) {
			rem=n%10;
			n=n/10;
			rev=(10*rev)+rem; 
			
		}
		System.out.print(rev);
		
	}

}
