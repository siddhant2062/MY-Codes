package searching_and_sorting;
import java.util.Scanner;
public class sum_of_two_arrays {
	
	public static int[] take_input(int size) {
		Scanner s=new Scanner(System.in);
		
		System.out.println("enter array elements:");
		int arr[]=new int[size];
		for (int i=0;i<size;i++) {
			arr[i]=s.nextInt();	
		}
		return arr;
	}
	public static void print(int a[]) {
		int size=a.length;
		for(int i=0;i<size;i++) {
			System.out.print(a[i]+" ");
		}
	}
	public static void add(int arr1[],int arr2[]) {
		int size1=arr1.length;
		int size2=arr2.length;
		int size;
		if(size1>size2) {
			size=size1+1;
			
		}else {
			size=size2+1;
		}
		int output[]=new int[size];	
		int i=size1-1;
		int j=size2-1;
		int k=size-1;
		
		int carry=0;
		
		while (i>=0 && j>=0) {
			int sum=arr1[i]+arr2[j]+carry;
			int rem=sum%10;
			output[k]=rem;
			carry=sum/10;
			i--;
			j--;
			k--;			
		}
		while (i>=0) {
			int sum=arr1[i]+carry;
			int rem=sum%10;
			output[k]=rem;
			carry=sum/10;
			i--;
			k--;
		}
		while (j>=0) {
			int sum=arr2[j]+carry;
			int rem=sum%10;
			output[k]=rem;
			carry=sum/10;
			j--;
			k--;
		}
		output[0]=carry;
		print(output);
	}
	

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.println("enter size of the array1:");
		int size1=s.nextInt();
		int arr1[]=take_input(size1);
		System.out.println("enter size of the array2:");
		int size2=s.nextInt();
		int arr2[]=take_input(size2);
		add(arr1,arr2);
	}
}

