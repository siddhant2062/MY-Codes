package pattern;
import java.util.Scanner;
public class rough {
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
    		System.out.print("*");
    		j=j+1;
    		
    	}
    	int k=2;
    	while(k<=i) {
    		System.out.print("*");
    		k=k+1;
    	}
    	System.out.println();
    	i=i+1;
    }
    int ii=1;
    int val=n-1;
    while(ii<=n) {
    	int spac=1;
    	while(spac<=n-val) {
    		System.out.print(" ");
    		spac=spac+1;
    	}
    	int jj=n-1;
    	while(jj>=ii) {
    		System.out.print("*");
    		jj=jj-1;
    	}
    	int kk=n-2;
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
