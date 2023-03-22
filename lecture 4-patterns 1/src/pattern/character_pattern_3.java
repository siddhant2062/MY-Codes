package pattern;
import java.util.Scanner;
public class character_pattern_3 {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		
		int i=1;
		int n=s.nextInt();		
		int a=n;
		
		while(i<=n) {
			int j=1;
			char c=64;
			while(j<=i) {
				System.out.print((char)(a+c));
				j=j+1;
				c=(char)(c+1);
			}
			System.out.println();
			i=i+1;
			a=a-1;
			
				
			}
		}
	}


