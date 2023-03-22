package recursion;
import java.util.*;
public class XIV_quick_sort {
	static void quicksort(int arr[],int start,int end) {
		if(start>=end) {
			return;
		}
		int low=start;
		int high=end;
		int mid=low+(high-low)/2;
		int pivot=arr[mid];
		while(low<=high) {
			while(arr[low]<pivot) {
				low++;
			}
			while(arr[high]>pivot) {
				high--;
			}
			if(low<=high) {
				int temp=arr[low];
				arr[low]=arr[high];
				arr[high]=temp;
				low++;
				high--;
			}
		}
		quicksort(arr,start,high);
		quicksort(arr,low,end);
		
	}
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		int size=s.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=s.nextInt();
		}
		quicksort(arr,0,size-1);
		System.out.println(Arrays.toString(arr));
		System.out.println();
	}
}
