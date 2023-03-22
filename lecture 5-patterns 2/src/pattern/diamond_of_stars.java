package pattern;
import java.util.Scanner;
public class diamond_of_stars {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		
		int i=1;
		int n=s.nextInt();
		int n1=(n+1)/2;
		int n2=n/2;
		
		while(i<=n1) {
			int space=1;
			while(space<=n1-i) {
				System.out.print(" ");
				space=space+1;
			}
			int j=1;
			while(j<=i) {
				System.out.print("*");
				j=j+1;
			}
			int k=1;
			while(k<=i) {
				if(k>=2) {
					System.out.print("*");					
				}
				k=k+1;			
			}
			System.out.println();
			i=i+1;			
		}
		
		
		int ii=1;
		int val=n1-1;
		while(ii<=n2) {
			int spac=1;
			while(spac<=n1-val) {
				System.out.print(" ");
				spac=spac+1;
			}
			int jj=n1-1;
			while(jj>=ii) {
				System.out.print("*");
				jj=jj-1;
			}
			int kk=n1-2;
			while(kk>=ii) {
				System.out.print("*");
				kk=kk-1;
			}
			System.out.println();
			ii=ii+1;
			val=val-1;
		}
		
	}

}
