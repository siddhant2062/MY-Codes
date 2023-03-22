package _1recursion;
import java.util.*;
public class _96_total_ways_to_climb_staircase {
	static int stairs(int n) {
		if(n==0) {
			return 1;			
		}else if(n<0) {
			return 0;
		}
		return stairs(n-1)+stairs(n-2)+stairs(n-3);
	}
	public static void main(String ars[]) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		System.out.println(stairs(n));
	}
}
