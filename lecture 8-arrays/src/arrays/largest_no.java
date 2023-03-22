package arrays;
import java.util.Scanner;
public class largest_no {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		
		int size=s.nextInt();
		int a[]=new int[size];
		int max=0;
		for(int i=0;i<size;i++) {
			 a[i]=s.nextInt();
		}
		
		for(int i=0,largest=0;i<size;i++) {
			if(a[i]>max) {
				max=a[i];
			}
		
		if(i==size-1) {
				System.out.print(max);
				
		}
			
		}
		
	}

}
