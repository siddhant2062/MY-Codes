import java.util.Scanner;
public class demo {
	public static void main (String[] args){

		Scanner s=new Scanner(System.in);
		System.out.println("enter the size of the array:");
		int size=s.nextInt();
		System.out.println("enter array elements:");
		int a[]=new int[size];
		for (int i=0;i<size;i++) {
			a[i]=s.nextInt();
			
		}
		System.out.println("the array elements are:");
		for (int i=0;i<size;i++) {
			System.out.print(a[i]+" ");
			
		}
		System.out.println("\nprime numbers in the array are:");
		for (int i=0;i<size;i++) {
			int count=0;
			for (int j=2;j<a[i]-1;j++) {
				if(a[i]%j==0) {
					count=count+1;
				}
			}
			if(count==0) {
				System.out.print(a[i]+" ");
				
			}
		}
		return;
	}
}
