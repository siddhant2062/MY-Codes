package pattern;
import java.util.Scanner;
public class triangle_of_numbers {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		
		int i=1;
		int n=s.nextInt();
		int var=0;
		
		while(i<=n) {
	        int space=1;
	        while(space<=n-i) {
	        	System.out.print(" ");
	        	space=space+1;
			}
	        int j=1;
	        int val=0;
	        while(j<=i) {
	        	System.out.print(i+val);
	        	j=j+1;
	        	val=val+1;
	        }
	       
	        int k=2;
	        int a=var;
	        while(k<=i) {
	        	System.out.print(a);
	        	a=a-1;
	        	k=k+1;
	        }
	        System.out.println();
	        i=i+1;
	        var=var+2;
	        
	      
		}
	  }
	}


