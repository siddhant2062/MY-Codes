package while_loop;
import java.util.Scanner;
public class fibonacci_series {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		
		int a=0;
		int b=1;
		int c;
		int i=1;
		int n=s.nextInt();
		System.out.print(a+" "+b+" ");
		
		while(i<=n){
			c=a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
			i=i+1;
		}
		
			
		}
		
		
	}


