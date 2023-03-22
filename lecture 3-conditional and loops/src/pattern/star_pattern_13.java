package pattern;
import java.util.Scanner;
public class star_pattern_13 {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		
		int i=1;
		int n=s.nextInt();
		int val=5;
		
		while(i<=n) {
			int space=1;
			while(space<=n-val) {
				System.out.print(" ");
				space=space+1;
			}
			int var=1;
			int j=5;
			while(j>=i) {
				if(var>1) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
				j=j-1;
				var=var+1;
			}
			System.out.println();
			i=i+1;
			val=val-1;
			
					
				}
				
			}
		}
	


