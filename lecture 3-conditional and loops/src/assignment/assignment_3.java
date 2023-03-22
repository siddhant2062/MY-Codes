package assignment;
import java.util.Scanner;
public class assignment_3 {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		
		int x=s.nextInt();
		int n=s.nextInt();
		 int i=1;
		 int power=1;
		 
		 while(i<=n) {
			 power=power*x;
			 i=i+1;
		 }
		 System.out.print(power);
	}
}

