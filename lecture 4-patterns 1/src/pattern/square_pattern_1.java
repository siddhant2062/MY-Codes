package pattern;
import java.util.Scanner;
public class square_pattern_1 {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		
		int i=1;
		int n=s.nextInt();
		
		while(i<=n) {
			int j=1;
			while(j<=n) {
				System.out.print(n);
				j=j+1;
			}
			System.out.println();
			i=i+1;
			}
		}
	}


