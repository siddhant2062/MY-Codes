package for_loop;
import java.util.Scanner;
public class nth_fibonacci_no {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
	/*	
		int i=2;
		int a=0;
		int b=1;
		int n=s.nextInt();
		while(i<=n) {
			
			int c=a+b;
			if(i==n)
			System.out.print(c);
			a=b;
			b=c;
			i=i+1;
		}
		*/
		
		int n=s.nextInt();
		for(int i=2,a=0,b=1;i<=n;i++) {
			int c=a+b;
			if(i==n)
				System.out.print(c);
			a=b;
			b=c;
		}
		
	}

}
