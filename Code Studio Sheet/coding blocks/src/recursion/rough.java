package recursion;
import java.util.*;
public class rough {
	 public static int change(String columnTitle) {
		 Scanner s=new Scanner(System.in);
	        int n=columnTitle.length();
	        int value=columnTitle.charAt(n-1)-'A'+1;
	        
	        for(int i=1, j=n-2;j>=0;i++,j--)
	        {
	            char c=columnTitle.charAt(j);
	            value+=((c-'A'+1)*(Math.pow(26,i)));
	        }
	        
	        return value;
	    }
	
	  public static void main(String args[]) {
		  Scanner s=new Scanner(System.in);
		  String str=s.nextLine();
		  System.out.println(change(str));
	  }
	}