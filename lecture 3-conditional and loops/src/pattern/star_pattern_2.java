package pattern;
import java.util.Scanner;
public class star_pattern_2 {
	public static void main(String args[]) {
       Scanner s=new Scanner (System.in);
		
		int i=1;
		int n=s.nextInt();
		
		while(i<=n) {
			int j=1;
			while(j<=i) {
				System.out.print("*");
				j=j+1;
			}
			System.out.println();
			i=i+2;
			n=n+1;
				
			}
	}

}


