package rough;
import java.util.Scanner;
public class rough_7 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		int x=s.nextInt();
		double balance=s.nextDouble();
		
		if(balance%x==0) {
			balance=balance-(x+0.50);
			System.out.println(balance);
			return;
		}
		else if(balance%x!=0 || x>balance) {
			System.out.println(balance);
			return;
		}
		
		
	

	}

}
