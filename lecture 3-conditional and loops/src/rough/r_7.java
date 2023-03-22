package rough;
import java.util.Scanner;
public class r_7 {
public static void main(String args[]) {
	Scanner s=new Scanner(System.in);
	
	int i=1;
	int n=s.nextInt();
	int a=n;
	
	
	
	
	while(i<=n) {
		int c=64;
		int j=1;
		while(j<=i) {
			System.out.print((char)(c+a));
			j=j+1;
			
			c=(char)(c+1);
		
			
		}
		System.out.println();
		i=i+1;
		a=a-1;
		
		
			
			
		}
	}
}

