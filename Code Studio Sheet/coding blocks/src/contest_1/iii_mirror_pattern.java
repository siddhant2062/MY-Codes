package contest_1;
import java.util.*;
public class iii_mirror_pattern {
public static void main(String args[]) {
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	for(int i=1;i<2*n;i++) {
		int col=i<=n?i:2*n-i;
		for(int space=1;space<=n-col;space++) {
			System.out.print("\t");
		}
		for(int j=1;j<=2*col-1;j++) {
			System.out.print("*"+("\t"));
		}
		System.out.println();
	}
}
}
