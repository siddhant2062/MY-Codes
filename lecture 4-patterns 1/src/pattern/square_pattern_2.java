package pattern;
import java.util.Scanner;
public class square_pattern_2 {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		
		int i=1;
		int n=s.nextInt();
		int a=n;
		
		while(i<=n) {
				
			int j=a;
			while(j<=n&&j>0) {
				System.out.print(j);
				j=j-1;
				
			}
			System.out.println();
			i=i+1;
		}
	}

}
