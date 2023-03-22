package Assignment;
import java.util.Scanner;
public class check_number_sequence {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		
		
	        int n= s.nextInt();
	        int i=1;
	        int t=s.nextInt();
	        int count=0;
	        int flag=0;
	        while(i<n)
	        {
	            int p=s.nextInt();
	            if(p<t)
	            {
	               if(flag==0)  
	            {    i++;
	                count++;
	             t=p;
	             continue;
	            }
	                
	            }
	            if(t<p)
	            {
	                flag=1;
	                count++;
	                t=p;
	            }
	            i++;
	           
	        }
	        
	        if(count+1==n)
	        {
	            System.out.println(true);
	        }
	        else
	        {
	            System.out.println(false);
	        }
	        
	        
		}
}

