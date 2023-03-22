package contest_1;
import java.util.*;
public class ii_print_reverse {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		int value=s.nextInt();
//		String ans=Integer.toString(value);
		int rev=0;
		while(value!=0) {
			int rem=value%10;
			rev=(rev*10)+rem;
			value/=10;			
		}
		System.out.println(rev);			
		
	}
}
