package Assignment;
import java.util.Scanner;
public class binary_to_decimal {
	public static void main(String args[]) {
	Scanner s=new Scanner(System.in);
	
	
	int rem=0;
	
	
	int power=1;
	int decimal=0 ;
	int n=s.nextInt();
	while(n>0) {
		
		rem=n%10;
		decimal=decimal+(rem*power);		
		power=power*2;
		n=n/10;
		
	}
		System.out.print(decimal);
	
		
	
	
	}

		
		
		
		
	}



