package _1recursion;
import java.util.*;
public class _3_find_maximum_of_array {
	static int max(int arr[],int idx) {
		if(idx==arr.length-1) {
			return arr[idx];
		}
		int maxi=max(arr,idx+1);
		
		if(arr[idx]<maxi) {
			return maxi;
		}else {
			return arr[idx];
		}
	}
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		int size=s.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=s.nextInt();
		}
//		int target=s.nextInt();
		System.out.println(max(arr,0));
	}
}
