package arrays;
import java.util.Scanner;
public class arrays_sum {
	
	public static int[] take_input() {
		Scanner s=new Scanner(System.in);
		int size=s.nextInt();
		int a[]=new int[size];
		for(int i=0;i<size;i++) {
			a[i]=s.nextInt();			
		}
		return a;
	}
	public static int array_sum(int a[]) {
		int size=a.length;
		int sum=0;
		for(int i=0;i<size;i++) {
			sum=sum+a[i];
		}
		return sum;
		
	}
	public static void main(String args[]) {
		
		int b[]=take_input();
		int sum=array_sum(b);
		System.out.print(sum);
		
	}

}
