package Assignment;
import java.util.Scanner;
public class square_root {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		
		int n=s.nextInt();
		int i=1;
		int j=1;
		int sqrt;
		
		while(n>=0) {
			sqrt=i*j;
			if(sqrt>n) {
				i=i-1;
				j=j-1;				
				System.out.print(i);  //we can print either i or j because both gives same answer.
				return;
			}
			i=i+1;
			j=j+1;
			
			
		}
	}

}
