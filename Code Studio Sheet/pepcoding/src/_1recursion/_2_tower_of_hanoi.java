package _1recursion;
import java.util.*;
public class _2_tower_of_hanoi {
	static void toh(int n,String t1,String t2,String t3) {
		if(n==0) {
			
			return;
		}
		toh(n-1,t1,t3,t2);
		System.out.println(n+" disk moved from "+t1+" - "+t3);
		toh(n-1,t2,t1,t3);
	}
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		int disks=s.nextInt();
		String t1=s.next();
		String t2=s.next();
		String t3=s.next();
		
		toh(disks,t1,t2,t3);
	}
}
