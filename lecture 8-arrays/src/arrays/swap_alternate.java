package arrays;
import java.util.Scanner;
public class swap_alternate {
	public static int[] take_input() {
		Scanner s=new Scanner(System.in);
		
		int size=s.nextInt();
		int a[]=new int[size];
		for(int i=0;i<size;i++) {
		if(i%2==0) {
			a[i+1]=s.nextInt();
		}else {
			a[i-1]=s.nextInt();
		}
					
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
			
			int a[]=take_input();
			print(a);
			
		}
	}


