package recursion_1;
import java.util.*;
public class VI_print_all_permutation {
	static void permute(int arr[],int start,int end) {
		if(start==end) {
			System.out.println(Arrays.toString(arr));
		}else {
			for(int i=start;i<=end;i++) {
				swap(arr,start,i);
				permute(arr,start+1,end);
				swap(arr,start,i);
			}
		}
	}
	static void swap(int arr[],int start,int i) {
		int temp=arr[start];
		arr[start]=arr[i];
		arr[i]=temp;
	}
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		int size=s.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=s.nextInt();
		}
		permute(arr,0,size-1);
	}
}
