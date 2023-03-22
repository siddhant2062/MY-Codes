package fixed;
import java.util.*;
public class _1_Maximum_sum_subarray_of_size_k {
	static int max_window(int arr[],int k) {
		int maxi=Integer.MIN_VALUE;
		int sum=0;
		int start=0;
		for(int end=0;end<arr.length;) {
			
				sum+=arr[end];
				if(end-start+1<k) {
					end++;
				}else if(end-start+1==k) {
					maxi=Math.max(maxi,sum);
					sum-=arr[start];
					start++;
					end++;
				}
			
		}
		return maxi;
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[sc.nextInt()];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int k=sc.nextInt();
		System.out.println(max_window(arr,k));
	}
}
