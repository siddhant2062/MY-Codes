package pattern;
import java.util.Scanner;
public class character_pattern_2 {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		
		int i=1;
		int n=s.nextInt();
		char c=65;
		
		
		while(i<=n) {
			
			int j=1;
			
			int val=0;
			while(j<=i) {
				System.out.print((char)(c+val));
				j=j+1;
				val=val+1;
								
			}
			System.out.println();
			i=i+1;
			c=(char)(c+1);
			
		}
		
	}

}
