package binary_search;

import java.util.Scanner;

public class find_sqrt_precise {
	static long sqrt(int x) {
		int start=0;
		int end=x;
		long ans=-1;
		while(start<=end) {
			long mid=start+(end-start)/2;
			long square=mid*mid;
			if(square==x) {
				return mid;
			}else if(square<=x) {
				ans=mid;
				start=(int)(mid+1);
			}else {
				end=(int)(mid-1);
			}
		}
		return ans;
	}
	static double precise(int sqrt,int x,int precise) {
		double factor=1;
		double sqroot=sqrt;
		for(int i=0;i<precise;i++) {
			factor=factor/10;
			for(double j=sqroot;j*j<x;j=j+factor) {
				sqroot=j;
			}
		}
		return sqroot;
		
	}
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		int x=s.nextInt();
		int sqrt=(int)(sqrt(x));
		int precise_count=s.nextInt();
		System.out.println(precise(sqrt,x,precise_count));
	}
}
