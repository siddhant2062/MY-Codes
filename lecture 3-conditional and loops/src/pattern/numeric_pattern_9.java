package pattern;
import java.util.Scanner;
public class numeric_pattern_9 {
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
			int val_1=1;
			while(j>=i) {
				System.out.print(val_1);
				j=j-1;
				val_1=val_1+1;
				
			}
			System.out.println();
			i=i+1;
			val=val-1;
			}
			}
		
		}


