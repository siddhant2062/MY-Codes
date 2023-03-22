package easy;
import java.util.Scanner;
public class III_kadane_algo {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		int size=s.nextInt();
				
		int arr[]=new int[size];
		for(int i=0;i<arr.length;i++) {
			arr[i]=s.nextInt();
		}
		int sum=0;
		int max_sum=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
			if(sum>max_sum) {
				max_sum=sum;
			}
			if(sum<0) {
				sum=0;
			}
		}
		System.out.println(max_sum);
	}

}
//-2,1,-3,4,-1,2,1,-5,4
