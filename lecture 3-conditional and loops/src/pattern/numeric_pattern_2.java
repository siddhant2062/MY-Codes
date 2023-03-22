package pattern;
import java.util.Scanner;
public class numeric_pattern_2 {
	public static void main (String args[]) {
		Scanner s=new Scanner (System.in);
		
		int i=1;
		int val=1;		
		int n=s.nextInt();
		
		while(i<=n) {
			
		
			int j=1;
		while(j<=i) {
						
			System.out.print(val);
			val=val+1;
			j=j+1;
		}
		System.out.println();
		i=i+1;
		
			
}
 }
  }
   


