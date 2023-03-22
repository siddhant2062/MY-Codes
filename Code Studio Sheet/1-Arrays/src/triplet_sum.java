import java.util.*;
public class triplet_sum {
	public static void triplet(int arr[],int target) {
		for(int i=0;i<arr.length-2;i++) {
			for(int j=i+1;j<arr.length-1;j++) {
				for(int k=j+1;k<arr.length;k++) {
					if(arr[i]+arr[j]+arr[k]==target) {
						System.out.println("Triplet is " + arr[i] + ", " + arr[j] + ", " + arr[k]);
					}
				}
			}
		}
	}
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		int target=s.nextInt();
		int size=s.nextInt();
		int[] arr=new int[size];
		for(int i=0;i<arr.length;i++) {
			arr[i]=s.nextInt();
		}
		triplet(arr,target);
		
	}

}
