package recursion;
import java.util.*;
public class VI_linear_search {
	static boolean linear(int arr[],int target,int index) {
		if(index==arr.length) {
			return false;
		}
		return target==arr[index]||linear(arr,target,++index);
	}
	static int find_index(int arr[],int target,int index) {
		if(index==arr.length) {
			return -1;
		}
		if(arr[index]==target) {
			return index;
		}else {
			return find_index(arr,target,++index);
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
		System.out.println(linear(arr,target,0));
		System.out.println(find_index(arr,target,0));
		
	}
}
