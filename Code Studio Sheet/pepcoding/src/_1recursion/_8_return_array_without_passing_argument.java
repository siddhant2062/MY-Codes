package _1recursion;
import java.util.*;
public class _8_return_array_without_passing_argument {
	static int[] allIndex(int arr[],int x,int idx) {
		if(idx==arr.length) {
			return new int[0];
		}
		int small[]=allIndex(arr,x,idx+1);
		if(arr[idx]==x) {
			int temp[]=new int[small.length+1];
			temp[0]=idx;
			for(int i=0;i<small.length;i++) {
				temp[i+1]=small[i];
			}
			return temp;
		}else {
			return small;
		}
	}
	public static void main(String rags[]) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();			
		}
		int x=s.nextInt();
		System.out.println(Arrays.toString(allIndex(arr,x,0)));
//		System.out.println(0%10);
	}
}
