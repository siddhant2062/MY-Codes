package arrays;
import java.util.Scanner;
public class linear_search_2 {
	
	public static int[] take_input() {
		Scanner s=new Scanner(System.in);
		int size=s.nextInt();
		int a[]=new int[size];
		for(int i=0;i<size;i++) {
			a[i]=s.nextInt();
		}
		return a;
	}
	public static int linearSearch(int a[],int x) {
		
				
		int size=a.length;
		for(int i=0;i<size;i++) {
			if(a[i]==x) {
				
		         return i;
				
			}
			
		}
		
		
		return -1;
	}
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		
		int size=s.nextInt();
		int t[]=new int[size] ;
		for(int i=0;i<size;i++) {
		
				
		int a[]=take_input();
		int x=s.nextInt();
		int b=linearSearch(a,x);
		System.out.print(b);
	 }

   }
}


