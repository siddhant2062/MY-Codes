package rough;
import java.util.Scanner;
public class r_8 {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		
		int i=1;
		int n=s.nextInt();
		int val=1;
		
		while(i<=n) {
			int a=val;
			int j=1;
			while(j<=i) {
				System.out.print(a);
				j=j+1;
				a=a-1;
				
			}
			System.out.println();
			i=i+1;
			val=val+1;
			
		}
	}

}
