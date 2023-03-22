package arrays;
import java.util.Scanner;
public class take_input {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		
		int size=s.nextInt();
		int a[]=new int[size];
		for(int i=0;i<size;i++) {
			a[i]=s.nextInt();
          }
       for(int i=0;i<size;i++) {
        	System.out.print(a[i]+" ");  
          }
         
          
	}

}
