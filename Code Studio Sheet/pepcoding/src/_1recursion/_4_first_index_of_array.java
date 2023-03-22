package _1recursion;
import java.util.*;
public class _4_first_index_of_array {
	static int print(int arr[],int idx,int var) {
		if(idx==arr.length) {
			return -1;
		}

		if(arr[idx]==var) {
			return idx;
		}else {
		return print(arr,idx+1,var);

	}}
public static void main(String args[]) {
	Scanner s=new Scanner(System.in);
	int size=s.nextInt();
	int arr[]=new int[size];
	for(int i=0;i<size;i++) {
		arr[i]=s.nextInt();
	}
	int var=s.nextInt();
	System.out.println(print(arr,0,var));
}
}
