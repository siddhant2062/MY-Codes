package rough;
import java.util.Scanner;
public class rough {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		
		int i=1;
		int a=1;
		int n=s.nextInt();
		while(i<=n) {
		int j=n;
		
		while(j>=i) {
			if( a%2!=0) {
		System.out.print(a+" ");
		j--;
			}
			a++;
		
		}
		System.out.println();
		i++;
		
				
	}
	

}
}
