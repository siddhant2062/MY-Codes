package while_loop;
import java.util.Scanner;
public class palindrome_number {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		
		int n=s.nextInt();
		int i=n;//this i variable is only to store the original value of n, because the n value will be lost while running in the loop, and we cant compare original value with reverse value, and thus it can't be check that it is palindrome or not 
		int rem;
		int rev=0;
		
		while(n>0) {
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;			
			
		}
		if(rev==i) {
		System.out.println(i+" is palindrome no");
		}else {
			System.out.println(i+" is not palindrome no");
			
		}
	}

}
