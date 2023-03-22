package easy;
import java.util.*;
public class I_max_and_min {
	public static void main(String args[]) {
	Scanner s=new Scanner(System.in);
	int max=Integer.MIN_VALUE;
	int min=Integer.MAX_VALUE;
	int size=s.nextInt();
	int arr[]=new int[size];
	for(int i=0;i<arr.length;i++) {
		arr[i]=s.nextInt();
	}
	for(int i=0;i<arr.length;i++) {
		if(arr[i]<min) {
			min=arr[i];
		}
		if(arr[i]>max) {
			max=arr[i];
		}
	}
	System.out.println(min+"+"+max+"="+(max+min));
	}
}
//-2, 1, -4, 5, 3