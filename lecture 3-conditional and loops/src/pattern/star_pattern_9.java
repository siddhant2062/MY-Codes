package pattern;
import java.util.Scanner;
public class star_pattern_9 {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		
		int i=4;
		int n=s.nextInt();
		
		while(i<=n&&i>0) {
			int space=1;
			while(space<=n-i) {
				System.out.print(" ");
				space=space+1;
			}
			int j=1;
			while(j<=i) {
				System.out.print("*"+" ");
				j=j+1;
			}
			System.out.println();
			i=i-1;
			}
		}
	}


