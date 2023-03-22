package rough;

import java.util.Scanner;

public class rough {
	public static int[] take_input(int size) {
		Scanner s=new Scanner(System.in);
				
		int a[]=new int[size];
		for(int i=0;i<size;i++) {
			a[i]=s.nextInt();
		}
		return a;
	}

		
		
		
			
	
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		
		int size=s.nextInt();
		int a[]=take_input(size);
	
	}

}
