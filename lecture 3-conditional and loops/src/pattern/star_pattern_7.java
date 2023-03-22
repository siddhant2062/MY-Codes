package pattern;
import java.util.Scanner;
public class star_pattern_7 {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		
		int i=1;
		int n=s.nextInt();
		
		while(i<=n) {
			int space=1;
			while(space<=n-i) {
				System.out.print(" ");
				space=space+1;
			}
			int j=1;
			while(j<=i) {
				System.out.print("*");
				j=j+1;
			}
			System.out.println();
			i=i+1;
		}
		 int k=3;
		 while(k<=n&&k>0) {
			 int space_1=1;
			 while(space_1<=n-k) {
				 System.out.print(" ");
				 space_1=space_1+1;
			 }
			 int m=1;
			 while(m<=k) {
				 System.out.print("*");
				 m=m+1;
			 }
			 System.out.println();
			 k=k-1;
		 }
				 
					 
		 }
		 
			
		}
		
	


