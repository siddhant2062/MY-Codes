package pattern;
import java.util.Scanner;
public class star_pattern_3 {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		
		int i=1;
		int n=s.nextInt();
		
		while(i<=n) {
			int j=1;
			while(j<=5) {
				System.out.print("*");
				j=j+1;
			}
			System.out.println();
			i=i+1;
			
			}
		}
	}


