package recursion;
import java.util.*;
public class VIII_rotated_sorted_array {
	static int find_pivot(int start,int end,int arr[]) {
		if(arr[0]<=arr[arr.length-1]) {
			return -1;
		}
		if(start==end) {
			return start;
		}
		int mid=start+(end-start)/2;
		if(arr[0]<=arr[mid]) {
			return find_pivot(mid+1,end,arr);
		}else {
			return find_pivot(start,mid,arr);
		}
		
	}
	static int search(int start,int end,int arr[],int target) {
		if(start>end) {
			return -1;
		}
		int mid=start+(end-start)/2;
		if(arr[mid]==target) {
			return mid;
		}else if(arr[mid]<=target) {
			return search(mid+1,end,arr,target);
		}else {
			return search(start,mid-1,arr,target);
		}
	}
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		int size=s.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=s.nextInt();
		}
		int target=s.nextInt();
		int start=0;
		int end=arr.length-1;
		int pivot=find_pivot(start,end,arr);
		if(target>=arr[pivot]&&target<=arr[size-1]) {
			System.out.println(search(pivot,size-1,arr,target));
		}else {
			System.out.println(search(0,pivot-1,arr,target));
		}
	}
}
