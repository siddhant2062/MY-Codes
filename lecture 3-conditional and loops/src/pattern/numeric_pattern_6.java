package pattern;
import java.util.Scanner;
public class numeric_pattern_6 {
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
			int val=0;
			while(j<=i) {
				System.out.print(i+val);
				j=j+1;
				val=val+1;
			}
			System.out.println();
			i=i+1;
			
			
				
				
			}
		}
	}


