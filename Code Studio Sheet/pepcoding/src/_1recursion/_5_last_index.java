package _1recursion;
import java.util.*;
public class _5_last_index {
	static int last(int arr[],int idx,int var) {
		if(idx==arr.length) {
			return -1;
		}
		int out=last(arr,idx+1,var);
		if(out==-1) {
			if(arr[idx]==var) {
				return idx;
			}else {
				return -1;
			}
		}else {
			return out;
		}
	}
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		int size=s.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=s.nextInt();
			
		}
		int var=s.nextInt();
		System.out.println(last(arr,0,var));
	}
}
