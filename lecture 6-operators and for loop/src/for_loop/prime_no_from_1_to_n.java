package for_loop;
import java.util.Scanner;
public class prime_no_from_1_to_n {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		
	/*	int i=1;
		int n=s.nextInt();
		while(i<=n) {
			int j=2;
			int temp=0;
			while(j<=i-1) {
				if(i%j==0) {
				temp=temp+1;
				}
				j=j+1;
			}
				if(temp==0) {
					System.out.print(i+"=prime");
				}else {
					System.out.print(i+"=not prime");
				}
				System.out.println();
				i=i+1;
			}   */
		
		
		int i=1;
		int n=s.nextInt();
		for(i=1;i<=n;i++) {	
			int temp=0;
			for(int j=2;j<=i-1;j++) {
				if(i%j==0) {
					temp=temp+1;
				}
								
			}
			if(temp==0) {
				System.out.println(i+"=prime");
			}else {
				System.out.println(i+"=not prime");
				
			}
			
			
		}
	}
}


			

