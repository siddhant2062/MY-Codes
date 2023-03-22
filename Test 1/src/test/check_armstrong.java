package test;
import java.util.Scanner;
public class check_armstrong {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		
		int n=s.nextInt();
		int i=n;
		int length=0;
		while(i>0) {
			
			length=length+1;
			i=i/10;
		}
		int sum=0;
		int j=n;
		int rem=0;
		while(j>0) {
			rem=j%10;
			
			int k=1;
			int pow=1;
			while(k<=length) {
				pow=pow*rem;	
				k=k+1;
			}
			sum=sum+pow;	
			j=j/10;
		}
		if(sum==n) {
			System.out.print("true, it is an armstrong no");
		}else {
			System.out.print("false, it is not an armstring no" );
		}
	}

}
