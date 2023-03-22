package binary_search;
import java.util.*;
public class allocate_books {
	static boolean ispossible(int arr[],int size,int students,int mid) {
		int pagesum=0;
		int studentcount=1;
		for(int i=0;i<size;i++) {
			if(arr[i]+pagesum<=mid) {
				pagesum+=arr[i];
			}else {
				studentcount++;
				if(studentcount>students||arr[i]>mid) {
					return false;
				}
				pagesum=arr[i];
			}
		}

		return true;
	}
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		int size=s.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=s.nextInt();
		}
		
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		int start=0;
		int end=sum;
		int ans=-1;
		int students=s.nextInt();
		if(students>size) {
			System.out.println(-1);
			return;
		}
		while(start<=end) {
			int mid=start+(end-start)/2;
			if(ispossible(arr,size,students,mid)) {
				ans=mid;
				end=mid-1;
			}else {
				start=mid+1;
			}
		}
		System.out.println(ans);
	}
}
