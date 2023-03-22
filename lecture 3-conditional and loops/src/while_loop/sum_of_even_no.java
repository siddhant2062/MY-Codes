package while_loop;
import java.util.Scanner;
public class sum_of_even_no {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		
		int n=s.nextInt();
		int i=1;
    	int sum=0;
		
		
		while(i<=n) {
			
			if(i%2==0) {
			sum=sum+i;
			}
		     if(i==n) {
			               
				System.out.println(sum);
				
				
			}
			i=i+1;
			
				
			}
			
		}
		
}


