package Assignment;
import java.util.Scanner;
public class sum_or_product {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		
	/*	int n=s.nextInt();
		int c=s.nextInt();
		int i=1;
		int sum=0;
		int product=1;
		
		while(i<=n) {
			
			if(c==1) {
				sum=sum+i;
				if(i==n) {
					System.out.print(sum);
				}
		}  
			else if(c==2) {				
				product=product*i;
				if(i==n) {
					System.out.print(product);
				}
			}else {
				if(i==n) {
				System.out.print("-1");
			}
		}
			i=i+1;
			
			
		}  */
		
		int n=s.nextInt();
		int c=s.nextInt();
		int sum=0;
		int product=1;
		
		for(int i=1;i<=n;i++) {
			
			if(c==1) {
				sum=sum+i;
				if(i==n) {
					System.out.print(sum);
				}
		}  
			else if(c==2) {				
				product=product*i;
				if(i==n) {
					System.out.print(product);
				}
			}else {
				if(i==n) {
				System.out.print("-1");
			}
		}
			
			
		}		
		
	}

}
