package while_loop;
import java.util.Scanner;
public class prime_no_alternate_method {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		
		int n=s.nextInt();
		int i=2;
		while(i<=n-1) {
	
			if(n%i==0){
			
			

				System.out.println("not prime");
				return;
				
			}
			 i=i+1;
		}		
		System.out.println("prime no");		
	

		}
	}

	

