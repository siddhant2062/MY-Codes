package pattern;
import java.util.Scanner;
public class star_pattern_8_alternate {
	public static void main(String args[]) {
		Scanner s=new Scanner (System.in);
		
		int i=1;
		int n=s.nextInt();
		int val=4;
		
		while(i<=n) {
			int space=1;
			while(space<=n-val) {
				System.out.print(" ");
				space=space+1;
			}
			int j=4;
			while(j>=i) {
				System.out.print("*");
				j=j-1;
				
			}
			int k=3;
			while(k>=i) {
				System.out.print("*");
				k=k-1;
			}
			System.out.println();
			i=i+1;
			val=val-1;
			}
	
			
			
			
			}
		}
	


