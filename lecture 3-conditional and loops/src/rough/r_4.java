package rough;
import java.util.Scanner;
public class r_4 {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		
		int n=s.nextInt();
		int i=n;
		int length=0;
		while(n>0) {
			n=n/10;
			length=length+1;
		}
		int rem;
		int j=i;
		int sum=0;
		while(i>0) {
			rem=i%10;
			
			int multi=1;
			int k=1;
			while(k<=length) {
				multi=multi*rem;
				k=k+1;
			}
			sum=sum+multi;
			i=i/10;
		}
		if(j==sum) {
			System.out.println(j+" is armstrong no");
		}else {
			System.out.println(j+" is not an armstrong no");						
				
			}
			
			
		}
	}


