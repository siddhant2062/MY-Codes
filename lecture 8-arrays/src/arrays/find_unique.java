package arrays;
import java.util.Scanner;
public class find_unique {
	
	public static int[] take_input() {
		Scanner s=new Scanner(System.in);
		
		int size=s.nextInt();
		int a[]=new int[size];
		for(int i=0;i<size;i++) {
			a[i]=s.nextInt();
		}
           return a;
	}
	public static int unique(int a[]) {
		int xor=0;
		int size=a.length;
		for(int i=0;i<size;i++) {
			xor=xor^a[i];
			
		}
		return xor;
	}
	public static void main(String args[]) {
		
		int a[]=take_input();
		int b=unique(a);
		System.out.println(b);
	}
	
	
	

}
