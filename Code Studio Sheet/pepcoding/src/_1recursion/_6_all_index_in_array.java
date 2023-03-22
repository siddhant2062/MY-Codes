package _1recursion;
import java.util.*;
public class _6_all_index_in_array {
	static void all(int arr[],int idx,int x) {
		if(idx==arr.length) {
			return;
		}
		if(arr[idx]==x) {
			System.out.println(idx);
			all(arr,idx+1,x);
		}else {
			all(arr,idx+1,x);
		}
	}
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		int size=s.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=s.nextInt();
		}
		int x=s.nextInt();
		all(arr,0,x);
	}
}
