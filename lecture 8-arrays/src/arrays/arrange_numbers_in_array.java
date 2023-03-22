package arrays;
import java.util.Scanner;
public class arrange_numbers_in_array {
	
	public static int[] take_input() {
		Scanner s=new Scanner(System.in);
		
		int size=s.nextInt();
		int a[]=new int[size];
		int start=0;
		int end=size-1;
		int val=1;
		for(int i=0;i<size;i++) {
			if(val%2!=0) {
				a[start]=val;
				start=start+1;
			}else {
				a[end]=val;
				end=end-1;
			}
			val=val+1;
			
	
	}
		return a;


  }
	public static void print(int a[]) {
		int size=a.length;
		for(int i=0;i<size;i++) {
			System.out.print(a[i]+" ");
			
		}
	}
	public static void main(String args[]) {
		
		int array[]=take_input();
		print(array);
		
	}
}
