import java.util.Scanner;
public class binary_search {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		
		int size=s.nextInt();
		int arr[]=new int[size];
		for (int i=0;i<size;i++) {
			arr[i]=s.nextInt();			
		}
		int x=s.nextInt();
		int length=arr.length;
		int start=0;
		int end=length-1;
		int mid=(start+end)/2;
		while (start<=end) {
			if (arr[mid]==x) {
				System.out.println(mid);	
				return;
			}
			else if(arr[mid]>x) {
				end=mid-1;
			}
			else {
				start=mid+1;
			}
			mid=(start+end)/2;
		}
		System.out.println("-1");

	}
}
