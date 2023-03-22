import java.util.Scanner;
public class dd{
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);

		
		int i=1;
		int a=s.nextInt();
		int n=s.nextInt();
		int sum_even=0;
		int sum_odd=0;
		
		while(i<=n) {
			int a1=a%10;
			if(a1%2==0) {
				sum_even=sum_even+a1;
			}else {
				sum_odd=sum_odd+a1;
			}
			if(i==n) {							
			System.out.println(sum_even+" "+sum_odd);
			}
			a=a/10;
			i=i+1;
			
			
		}
		
	
		}
			
		
		
	}


	
		
	
