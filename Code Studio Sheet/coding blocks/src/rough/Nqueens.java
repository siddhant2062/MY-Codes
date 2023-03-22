package rough;
import java.util.*;
public class Nqueens {
	static double pow(double x,int n) {
		if(n==0) {
			return 1;
		}
		double pow=0;
		if(n>0) {
			double small=pow(x,n-1);
			pow=x*small;
		}else if(n<0) {
			double small=pow(x,n+1);
			pow=small/x;
		}
		return pow;
	}
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		double x=s.nextDouble();
		int n=s.nextInt();
		System.out.println(pow(x,n));
		
		
	}
}
