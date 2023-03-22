package arrays;

import java.util.Scanner;

public class function_take_input {
	
	public static int[] take_input() {
		Scanner s=new Scanner(System.in);
		int size=s.nextInt();
		int a[]=new int[size];
		for(int i=0;i<size;i++) {
			a[i]=s.nextInt();
			
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
