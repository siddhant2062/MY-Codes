package rough;
import java.util.Scanner;
public class r_1{
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);

		
		
	
		int n=s.nextInt();
		int sum_even=0;
		int sum_odd=0;
		
		while(n>0) {
			int a1=n%10;
			if(a1%2==0) {
				sum_even=sum_even+a1;
			}else {
				sum_odd=sum_odd+a1;
			}
			n=n/10;
		}
			System.out.println(sum_even+" "+sum_odd);
					
			
		}
		
	
		}
			
		