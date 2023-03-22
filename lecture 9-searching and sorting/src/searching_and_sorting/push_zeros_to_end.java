package searching_and_sorting;
import java.util.Scanner;
public class push_zeros_to_end {
	public static int[] take_input(int size) {
		Scanner s=new Scanner(System.in);
				
		int a[]=new int[size];
		for(int i=0;i<size;i++) {
			a[i]=s.nextInt();
		}
		return a;
	}
	public static void pushZerosAtEnd(int arr[]) {
		
		int size=arr.length;
		int temp=0;
		for(int i=0;i<size;i++) {		
				if(arr[i]==0) {
				temp++;	
				}				
			}
		for(int j=0;j<size;j++) {
			if(arr[j]!=0) {
				System.out.print(arr[j]+" ");
			}
		}
		for(int k=0;k<temp;k++) {
			arr[k]=0;
			System.out.print(arr[k]+" ");
		}
	}
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		
		int size=s.nextInt();
		int a[]=take_input(size);
		pushZerosAtEnd(a);
	}

}
