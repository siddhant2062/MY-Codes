package while_loop;
import java.util.Scanner;
public class search_prime_or_not {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		
		int i=2;
		int n=s.nextInt();
		int temp=0;
		
		while(i<=n-1) {
			if(n%i==0) {
				temp=temp+1;
			}
			i=i+1;
			}
		if(temp==0) {
			System.out.print(n+"=prime");
		}else {
			System.out.print(n+"=not prime");
		}
		
	}

}
