package bitwise;
import java.util.*;
public class decimal_to_binary {
	static int pow(int n,int count) {
		int power=1;
		for(int i=1;i<=count;i++) {
			power=power*n;
		}
		return power;
	}
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int binary=0;
		int count=0;
		while(n!=0) {
			int digit=n&1;
			binary=(pow(10,count)*digit)+binary;
			n>>=1;
			count++;
		}
		System.out.println(binary);
		System.out.println(5>>1);
		
	}
}
