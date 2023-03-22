package loops;
import java.util.Scanner;
public class function_fibonacci_member {
	public static boolean checkMember(int n){
		int a=0;
		int b=1;
		int i=1;
		while(i<=n) {
			int c=a+b;
			a=b;
			b=c;
			i++;
			if(n==c) {
				return true;
			
			}
		}
		return false;
		
		
	}
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		
		int n=s.nextInt();
		boolean a=checkMember(n);
		System.out.print(a);
		}
		
	}


