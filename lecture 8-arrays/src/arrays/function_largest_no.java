package arrays;
import java.util.Scanner;
public class function_largest_no {
	
	public static int[] take_input() {
		Scanner s=new Scanner(System.in);
		int size=s.nextInt();
		int a[]=new int[size];
		for(int i=0;i<size;i++) {
			a[i]=s.nextInt();			
		}
		return a;
	}
	public static int largest_no(int a[]) {
		int size=a.length;
		int max=Integer.MIN_VALUE;
		for(int i=0;i<size;i++) {
			if(a[i]>max) {
				max=a[i];
			}
			
		}
		return max;
	}
	public static void main(String args[]) {
	
		
		
		int a[]=take_input();
		int largest=largest_no(a);
		System.out.print(largest);
		
	}
	

}
