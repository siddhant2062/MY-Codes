package pattern;
import java.util.Scanner;
public class star_pattern_14 {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		
		int i=1;
		int n=s.nextInt();
		int var=4;
		
		while(i<=n) {
			int space=1;
			while(space<=n-var) {
				System.out.print(" ");
				space=space+1;
			}
			int j=4;
			int val=1;
			while(j>=i) {
				if(val>1) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
				j=j-1;
				val=val+1;
			}
			int k=3;
			while(k>=i) {
				if(i<=k-1) {
				System.out.print(" ");
				}else {
					System.out.print("*");
				}
				k=k-1;
			}
			System.out.println();
			i=i+1;
			var=var-1;
				}
			
				
			}
			
		}
		

	
		
		
	


