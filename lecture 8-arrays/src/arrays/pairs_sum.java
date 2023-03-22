package arrays;
import java.util.Scanner;
public class pairs_sum {
	public static int[] take_input(int size) {
		Scanner s=new Scanner(System.in);
		
		int a[]=new int[size];
		for(int i=0;i<size;i++) {
			a[i]=s.nextInt();			
		}
		return a;		
	}
	public static int pairSum(int arr[], int x) {
	
	int size=arr.length;
	int pair=0;
	for(int i=0;i<size;i++) {
		for(int j=i+1;j<size;j++) {
			if(arr[i]+arr[j]==x) {
				pair=pair+1;
			}
		}
	}
   return pair;
}
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		
		int size=s.nextInt();
		int a[]=take_input(size);
		int x=s.nextInt();
		int pair=pairSum(a,x);
		System.out.println(pair);
	}
}

