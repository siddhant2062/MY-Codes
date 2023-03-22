package binary_search;

import java.util.Scanner;

public class search_in_rotated_sorted_array {
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
	public static int search(int[] arr, int target) {
        int pivot=pivot(arr);       
        int start=0;
        int end=arr.length-1;
        if(target>=arr[pivot]&&target<=arr[end]){
        	start=pivot;
        }else{
        	end=pivot-1;
        }
       
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target==arr[mid]){
                return mid;
            }else if(arr[mid]<target){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        
        return -1;
    }
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		int target=s.nextInt();
		System.out.println(pivot(arr));
		System.out.println(search(arr,target));
	}
}
