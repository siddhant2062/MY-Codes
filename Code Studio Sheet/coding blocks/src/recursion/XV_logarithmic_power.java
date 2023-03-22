package recursion;
import java.util.*;
public class XV_logarithmic_power {
	static int logp(int x,int n) {
		if(n==0) {
			return 1;
		}
		int xnby2=logp(x,n/2);
		int ans=xnby2*xnby2;
		if(n%2!=0) {
			ans*=x;
		}
		return ans;
	}
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		int x=s.nextInt();
		int n=s.nextInt();
		System.out.println(logp(x,n));
	}
}
