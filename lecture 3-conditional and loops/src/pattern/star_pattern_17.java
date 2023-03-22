package pattern;
import java.util.Scanner;
public class star_pattern_17 {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		
		int i=1;
		int n=s.nextInt();
		
		while(i<=n) {
			int space=1;
			while(space<=n-i) {
				System.out.print(" ");
				space=space+1;
			}
			int j=1;
			while(j<=i) {
				if(j>1) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
				j=j+1;
			}
			int k=2;
			while(k<=i) {
				if(k<=i-1) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
				k=k+1;
			}
			System.out.println();
			i=i+1;
		}
		int ii=1;
		int val=3;
		while(ii<=n) {
			int spac=1;
			while(spac<=n-val) {
				System.out.print(" ");
				spac=spac+1;
			}
			int jj=3;
			int var=1;
			while(jj>=ii) {
				if(var>1) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
				var=var+1;
				jj=jj-1;				
				}
			int kk=2;
			while(kk>=ii) {
				if(ii<=kk-1) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
				kk=kk-1;
			}
			System.out.println();
			ii=ii+1;
			val=val-1;
		
		}
	}
}
				
			
				
				
			
				
			
		