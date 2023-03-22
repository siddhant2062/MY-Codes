package while_loop;
import java.util.Scanner;
public class armstrong_number {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		
		
		int n=s.nextInt();
		int i=n;
		int length=0;
		
		
		while(i>0) {			
			length=length+1;
			i=i/10;
		}
		int rem;
		int sum=0;		
		int j=n;
		while(j>0) {			
			rem=j%10;
			
			
			
			int multiply=1;			
			int k=1;
			while(k<=length) {
				multiply=multiply*rem;
				k=k+1;
			}
			sum=sum+multiply;
			j=j/10;
			
			}
		
		
	
		if(sum==n) {
			System.out.println(n+" is an armstrong no");   
		}else {
			System.out.println(n+" is not an armstrong no"); 
		}
	}

}
