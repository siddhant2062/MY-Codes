package recursion_1;
import java.util.*;
public class VII_count_all_permutation {
	static int permute(int arr[],int start,int end) {
		if(start==end) {
			return 1;
		}else {
			int count=0;
			for(int i=start;i<=end;i++) {				
				swap(arr,start,i);
				count=count+permute(arr,start+1,end);
				swap(arr,start,i);
			}
			return count;
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
		System.out.println(permute(arr,0,size-1));
	}
}