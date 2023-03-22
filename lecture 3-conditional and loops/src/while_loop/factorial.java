package while_loop;
import java.util.Scanner;
public class factorial {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		
		int i=1;
		int n=s.nextInt();
		 while(i<=n) {
			 int j=1;
			 int fact=1;
			 while(j<=i) {
				 fact=fact*j;				
				 j=j+1;
			 }
			 System.out.print(fact);
			 System.out.println();
			 i=i+1;
			 }
		 }
		
	}


