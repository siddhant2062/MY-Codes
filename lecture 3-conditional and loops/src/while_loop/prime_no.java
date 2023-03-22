
package while_loop;
import java.util.Scanner;
public class prime_no {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		int i;
		int j=s.nextInt();
		int k=0;
		
		for(i=1;i<=j;i++) {
			if(j%i==0) {
				k=k+1;
			}
			if(k==2) {
				System.out.println("prime no");
			}else {
				System.out.println("not prime no");
				
			}
		}
		}
	}


