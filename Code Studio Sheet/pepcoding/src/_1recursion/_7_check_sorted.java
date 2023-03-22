package _1recursion;
import java.util.*;
public class _7_check_sorted {
	static boolean check(int arr[],int idx) {
		if(idx>=arr.length-1) {
			return true;
		}
		if(arr[idx]>arr[idx+1]) {
			return false;
		}else {
			return check(arr,idx+1);
		}
	}
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();			
		}
		System.out.println(check(arr,0));
	}
}
