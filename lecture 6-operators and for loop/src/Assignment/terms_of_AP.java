package Assignment;
import java.util.Scanner;
public class terms_of_AP {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		 
       int i=1;
       int j=1;
       int n=s.nextInt();
       
       while(i<=n) {
    	   int num=3*j+2;
    	   if(num%4!=0) {
    		   System.out.print(num+" ");
    		   i=i+1;
    	   }
    	  
    	    j=j+1;
       }
   
		}

	}


