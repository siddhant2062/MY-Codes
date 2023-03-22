package arrays;
import java.util.Scanner;
public class linear_search {
	
	public static int[] take_input() {
		Scanner s=new Scanner(System.in);
		int size=s.nextInt();
		int a[]=new int[size];
		for(int i=0;i<size;i++) {
			a[i]=s.nextInt();
		}
		return a;
	}
	public static void linear(int a[],int x) {
		
				
		int size=a.length;
		for(int i=0;i<size;i++) {
			if(a[i]==x) {
				System.out.print(i);
		         return;
				
			}
			
		}
		
		System.out.print("-1");
		
	}
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		
		int x=s.nextInt();
		int a[]=take_input();
		linear(a,x);
	}

}
