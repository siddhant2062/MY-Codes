package contest_1;
import java.util.*;
public class vii_nth_fibonacci {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		int a=0;
		int b=1;
		int c;
		int n=s.nextInt();
		for(int i=2;i<=n;i++) {			
			c=a+b;
			a=b;
			b=c;
			if(i==n) {
				System.out.println(c);
			}
		}
		
	}

}
