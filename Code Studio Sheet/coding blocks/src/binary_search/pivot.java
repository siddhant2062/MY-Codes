package binary_search;
import java.util.Scanner;
public class pivot {
	public static int pivot(int arr[]) {
		int start=0;
		int end=arr.length-1;
		while(start<end) {
			int mid=start+(end-start)/2;
			if(arr[0]<=arr[mid]) {
				start=mid+1;
			}else {
				end=mid;
			}
		}
		return start;
	}
	
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		System.out.println(pivot(arr));
	}
}
