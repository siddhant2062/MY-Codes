package rough;
import java.util.Arrays;
import java.util.Scanner;
public class Rough_1 {
//	public static void print(int n){
//	    if(n < 0){
//	        return;
//	    }
//	    if(n == 0){
//	        System.out.println(n);
//	        return;
//	    }
//	    print(n--);
//	    System.out.print(n+" ");
//	}
//
//	public static void main(String[] args) {
//	    int num = 3;
//	    print(num);
//	}
	static void merge(int arr[],int start,int end) {
		if(start>=end) {
			return;
		}
		int mid=start+(end-start)/2;
		merge(arr,start,mid);
		merge(arr,mid+1,end);
		merging(arr,start,mid,end);
	}
	static void merging(int arr[],int start,int mid,int end) {
		int merge[]=new int[end-start+1];
		int i=start;
		int size1=mid;
		int j=mid+1;
		int size2=end;
		int k=0;
		while(i<=size1&&j<=size2) {
			if(arr[i]<=arr[j]) {
				merge[k++]=arr[i++];
			}else {
				merge[k++]=arr[j++];
			}
		}
		while(i<=size1) {
			merge[k++]=arr[i++];
		}
		while(j<=size2) {
			merge[k++]=arr[j++];
		}
		for(i=0,j=start;i<merge.length;i++,j++) {
			arr[j]=merge[i];
		}
	}
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		int size=s.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=s.nextInt();
		}
		merge(arr,0,arr.length-1);
		System.out.println(Arrays.toString(arr));
		
		
	}
}
	
