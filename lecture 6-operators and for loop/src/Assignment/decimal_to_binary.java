package Assignment;
import java.util.Scanner;
public class decimal_to_binary {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		
		int n=s.nextInt();
		int rem=0;
		long binary=0;
		int pow=1;
		while(n>0) {
			rem=n%2;
			binary=binary+(rem*pow);
			n=n/2;
			pow=pow*10;
		}
		System.out.print(binary);
	}

}
 