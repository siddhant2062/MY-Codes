package rough;// package ko mat likhiye ga
import java.util.Scanner;
public class rough_3 { //rough_3 ke jagah miss likh dijiyega
	public static int[] take_input(int size) {
		Scanner s=new Scanner(System.in);
	
	int a[]=new int[size];
	for(int i=0;i<size;i++) {
		a[i]=s.nextInt();		
	}
	return a;
	}
	public static int missing(int a[]) {
		
	     int i, total;
	     int n=a.length;
	        total = (n + 1) * (n + 2) / 2;
	        for (i = 0; i < n; i++)
	            total -= a[i];
	        return total;
	    }
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		
		int size=s.nextInt();
		int arr[]=take_input(size);
		int find=missing(arr);
		System.out.println(find);
			
	}
}
