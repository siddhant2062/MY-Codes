package pattern;
import java.util.Scanner;
public class numeric_pattern_8 {
	public static void main(String args[]) {
		 Scanner s=new Scanner(System.in);
		 
		 int i=5;
	      int n=s.nextInt();
		
		 while(i<=n&&i>0) {
			 int j=1;			
			 while(j<=i) {
		     System.out.print(j);
			 j=j+1;
			 
		 }
		 System.out.println();
		 i=i-1;
		 
		 

		  } 
	}

}
