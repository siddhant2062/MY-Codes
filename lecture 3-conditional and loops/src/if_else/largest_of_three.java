package if_else;
import java.util.Scanner;
public class largest_of_three {
	public static void main(String args[]) {
		
		Scanner s=new Scanner(System.in);
		
		int a=s.nextInt();
		int b=-s.nextInt();
		float c=s.nextFloat();
		
		if(a>=b&&a>=c) {
			System.out.println(a);
		}else {
			if(b>=a&&b>=c) {
			System.out.println(b);
			}else {
				System.out.println(c);
			}
		}
		
		
	}

}
