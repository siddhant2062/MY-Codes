package pattern;
import java.util.Scanner;
public class star_pattern_16 {
	public static void main(String args[]) {
		Scanner s=new Scanner (System.in);
		
		int i=1;
		int n=s.nextInt();
		int val=4;
		
		while(i<=n) {
			int space=1;                //int space=4;			
			while(space<=n-val) {       //while(space>=i){				
				System.out.print(" ");  //System.out.print(" ");								
				space=space+1;          //space=space-1;           //no need to take integer val
			}
			int var=1;
			int j=4;
			while(j>=i) {
				if(var>1) {
					System.out.print(" ");
				}else {
					System.out.print("*");					
				}
				j=j-1;
				var=var+1;
			}
			int k=3;
			while(k>=i) {
				if(i<=k-1) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
				k=k-1;			
			}
			System.out.println();
			i=i+1;
			val=val-1;
			
		}
		int ii=2;
		
				
		while(ii<=n) {			
			int spac=1;
			while(spac<=n-ii) {
				System.out.print(" ");
				spac=spac+1;
			}
		
					
			int jj=1;
			int value=1;
			while(jj<=ii) {
				if(value>1) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
				jj=jj+1;
				value=value+1;
				}
		
			int kk=2;
			while(kk<=ii) {
				if(kk<=ii-1) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
				kk=kk+1;
				}
		
			System.out.println();
			ii=ii+1;
			
		
			}
					
		}
	}


