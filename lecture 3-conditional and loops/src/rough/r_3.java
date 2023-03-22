package rough;
import java.util.Scanner;
public class r_3{
	public static void main(String args[]) {
    Scanner s=new Scanner(System.in);
    
        int i=1;
        int sum_even=0;
        int sum_odd=0;
         int n=s.nextInt();
         
         while(i<=n) {
        	 if(i%2==0) {
        		 sum_even=sum_even+i;
        	 }else {
        		 sum_odd=sum_odd+i;
        	 }
        	 i=i+1;
        	 }
         System.out.println(sum_even);
         System.out.println(sum_odd);
         }
   
		}
		
	
	
				
	


