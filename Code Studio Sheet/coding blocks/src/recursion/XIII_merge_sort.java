package recursion;
import java.util.*;
public class XIII_merge_sort {
	static void mergesort(int arr[],int start,int end) {
		if(start>=end) {
			return;
		}
			int mid=start+(end-start)/2;
			mergesort(arr,start,mid);
			mergesort(arr,mid+1,end);
			merge(arr,start,mid,end);
		
	}
	static void merge(int arr[],int start,int mid,int end) {
		int merge[]=new int[end-start+1];
		int i=start;
		int j=mid+1;
		int k=0;
		while(i<=mid && j<=end) {
			if(arr[i]<=arr[j]) {
				merge[k++]=arr[i++];
			}else {
				merge[k++]=arr[j++];
			}
		}
		while(i<=mid) {
			merge[k++]=arr[i++];
		}
		while(j<=end) {
			merge[k++]=arr[j++];
		}
		for(i=0,j=start;i<merge.length;i++,j++) {
			arr[j]=merge[i];
		}
		
	}
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		int size=s.nextInt();
//		int arr[]= {6,3,9,5,2,8};
		int arr[]=new int[size];
//		int size=arr.length;
		for(int i=0;i<size;i++) {
			arr[i]=s.nextInt();
		}
		mergesort(arr,0,size-1);
		System.out.println(Arrays.toString(arr));
	}
  

}
