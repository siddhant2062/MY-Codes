package pattern;
import java.util.Scanner;
public class star_pattern_15 {
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
				if(j>1) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
				j=j+1;				
				}
			
			int k=2;
			while(k<=i) {
				if(k<=i-1) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
				k=k+1;
				}
			
			System.out.println();
			i=i+1;
			}
		
		}
		
	}


