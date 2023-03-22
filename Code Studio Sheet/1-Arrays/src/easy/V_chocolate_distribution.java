package easy;
import java.util.*;
public class V_chocolate_distribution {
	static int distribute(int arr[],int size,int m) {
		int min_gap=Integer.MAX_VALUE;
		for(int i=0;i<=size-m;i++) {
			int first=i;
			int last=i+m-1;
			int gap=arr[last]-arr[first];
			if(gap<min_gap) {
				min_gap=gap;
			}
		}
		return min_gap;
	}
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		int size=s.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<arr.length;i++) {
			arr[i]=s.nextInt();
		}
		int students=s.nextInt();
		Arrays.sort(arr);
		System.out.println(distribute(arr,size,students));
	}
}
