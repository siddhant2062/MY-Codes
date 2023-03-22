package contest_1;
import java.util.*;
public class iv_simple_input {
	public static void main(String args[]) {
	Scanner s=new Scanner(System.in);
		int arr[]=new int[1000];
		int sum=0;
		int count=0;
	for(int i=0;i<1000;i++) {
		arr[i]=s.nextInt();
		sum=sum+arr[i];
		count++;
		if(sum<0) {
			break;
		}
	}
	for(int i=0;i<count-1;i++) {
		System.out.println(arr[i]);
	}
	}

}
