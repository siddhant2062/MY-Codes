package binary_search;
import java.util.Scanner;
public class find_sqrt {
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
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		int x=s.nextInt();
		System.out.println(sqrt(x));
	}

}
