package recursion;
import java.util.*;
public class III_Binary_search {
	static int search(int start,int end,int target,int arr[]) {
		if(start>end) {
			return -1;
		}
		int mid=start+(end-start)/2;
		if(arr[mid]==target) {
			return mid;
		}else if(target<arr[mid]) {
			return search(start,mid-1,target,arr);
		}else {
			return search(mid+1,end,target,arr);
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
		int end=size-1;
		System.out.println(search(start,end,target,arr));
	}
}
