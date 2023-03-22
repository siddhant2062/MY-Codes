package binary_search;
import java.util.Scanner;
public class binary {

	public static int[] take_input(int size) {
		Scanner s=new Scanner(System.in);
		
		int arr[]=new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=s.nextInt();
		}
		return arr;
	}
	public static int binarySearch(int arr[],int x) {
		
		
		int size=arr.length;
		int start=0;
		int end=size-1;
		int mid=(start+end)/2;
		while(start<=end) {
			if(arr[mid]==x) {				
			return mid;
			
			}
			else if(arr[mid]>x) {
				end=mid-1;
			}else {
				start=mid+1;
				
			}
			mid=(start+end)/2;			 
		}
		return -1;	
	}
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		
		int size=s.nextInt();
		int arr[]=take_input(size);		
		int x=s.nextInt();
		int bin=binarySearch(arr,x);
		System.out.print(bin);
		
		}
	}


