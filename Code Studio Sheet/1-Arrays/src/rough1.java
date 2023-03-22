/*
 truth table of xor
  0 1=1
  1 0=1
  1 1=0
  0 0=0
  
  note:- i) let suppose 5^0 than it is 5......any number xor(^) 0 is that number itself
  		 ii)
*/

import java.util.*;
public class rough1 {
	static void unique(int arr[]) {
		int xor=0;
		for(int i=0;i<arr.length;i++) {			
			xor=xor^arr[i];
		}
		System.out.println(xor);
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int size=s.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<arr.length;i++) {
			arr[i]=s.nextInt();
		}
		unique(arr);
	}

}
