package searching_and_sorting;
import java.util.Scanner;
public class rotate_array {
	public static int[] take_input(int size) {
		Scanner s=new Scanner(System.in);
		
		int a[]=new int[size]; 
			for(int i=0;i<size;i++) {
				a[i]=s.nextInt();
				
			}
			return a;
		}
	public static void rotate(int arr[],int d) {
		
		int size=arr.length;
		for(int i=0;i<d;i++) {
			
			int temp=arr[0];
			for(int j=0;j<size-1;j++) {		  
			 arr[j]=arr[j+1];	
		}
			arr[size-1]=temp;		
	}
		for(int k=0;k<size;k++) {
			System.out.print(arr[k]+" ");
		}
}
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		
		int size=s.nextInt();
		int a[]=take_input(size);
		int d=s.nextInt();
		rotate(a,d);
	}
}


