package pattern;
import java.util.Scanner;
public class inverted_number_pattern {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		
			
		int i=1;
		int n=s.nextInt();
		int val=n;
		while(i<=n) {
			int j=n;
			while(j>=i) {
				System.out.print(val);
				j=j-1;
			}
			System.out.println();
			i=i+1;
			val=val-1;
		}
	}

}
