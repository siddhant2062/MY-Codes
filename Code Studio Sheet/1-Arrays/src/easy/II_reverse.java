package easy;
import java.util.Scanner;
public class II_reverse {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=s.nextInt();
		}
		for(int first=0,last=arr.length-1;first<last;first++,last--) {
			int temp=arr[first];
			arr[first]=arr[last];
			arr[last]=temp;
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
