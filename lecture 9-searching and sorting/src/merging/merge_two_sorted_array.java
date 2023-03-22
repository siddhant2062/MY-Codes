package merging;
import java.util.Scanner;
public class merge_two_sorted_array {
	public static int[] take_input(int size) {
		Scanner s=new Scanner(System.in);
		
		int a[]=new int[size];
		for(int i=0;i<size;i++) {
			a[i]=s.nextInt();
		}
		return a; 
	}
	public static int[] take_input_1(int size) {
		Scanner s=new Scanner(System.in);
		
		int b[]=new int[size];
		for(int i=0;i<size;i++) {
			b[i]=s.nextInt();			
		}
		return b;
	}
	public static int[] merge(int arr1[],int arr2[]) {
		
		
		int size1=arr1.length;
		int size2=arr2.length;
		int size=(size1+size2);
		int arr[]=new int[size];
		int i=0;
		int j=0;
		int k=0;
		while(i<size1&&j<size2) {
					
			if(arr1[i]<=arr2[j]) {
			arr[k]=arr1[i];
			i++;
			k++;
			}
			
			else if(arr2[j]<=arr1[i]) {
				arr[k]=arr2[j];
				j++;
				k++;
		}
		
	}
		while(i<size1) {
			arr[k]=arr1[i];
			i++;
			k++;
		}
		while(j<size2) {
			arr[k]=arr2[j];
			j++;
			k++;
		}
		return arr;
  }

public static void main(String args[]) {
	Scanner s=new Scanner(System.in);
	
	int size1=s.nextInt();
	int a[]=take_input(size1);
	int size2=s.nextInt();
	int b[]=take_input_1(size2);
	int arr[]=merge(a,b);

	
	for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i]+" ");
	}
	
  }
}
