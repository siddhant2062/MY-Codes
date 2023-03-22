package arrays;
import java.util.Scanner;
public class find_duplicate {
	
	public static int[] take_input() {
		Scanner s=new Scanner(System.in);
		
		int size=s.nextInt();
		int a[]=new int[size];
		for(int i=0;i<size;i++) {
			a[i]=s.nextInt();
			
		}
		return a;
	}
	public static void duplicate(int a[]) {
		
		int size=a.length;
		for(int i=0;i<size;i++) {
			for(int j=i+1;j<size;j++) {
				if(a[i]==a[j]) {
					System.out.println(a[j]);
			}
		}
	}
}
	public static void main(String args[]) {
		
		int a[]=take_input();
		duplicate(a);
		
	}
}
