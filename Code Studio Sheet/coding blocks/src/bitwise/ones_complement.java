package bitwise;
import java.util.*;
public class ones_complement {
	static int bin_to_dec(int bin) {
		int dec=0;
		int count=0;
		while(bin!=0) {
			int rem=bin%10;
			dec=dec+(pow(2,count)*rem);
			count++;
			bin/=10;			
		}
		return dec;
	}
	static int pow(int a,int count) {
		int power=1;
		for(int i=1;i<=count;i++) {
			power=power*a;
		}
		return power;
	}
public static void main(String args[]) {
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int start=0;
	int count=0;
	while(n!=0) {
		int digit=n&1;
		if(digit==1) {
			digit=0;
		}else {
			digit=1;
		}
		start=(digit*pow(10,count))+start;
		count++;
		n>>=1; 
//		n/=10;
	}
	System.out.println(bin_to_dec(start));
	int mask=1;
	System.out.println((mask<<1)|1);
	
}
}
