package insertion_sorting;
import java.util.Scanner;
public class ascending_order {
	public static int[] take_input(int size) {
		Scanner s=new Scanner(System.in);
		
		int a[]=new int[size];
		for(int i=0;i<size;i++) {
			a[i]=s.nextInt();
			
		}
		return a;
		
	}
	public static void ascending(int arr[]) {
		
		int size=arr.length;
	
		for(int i=1;i<size;i++) {
			int temp=arr[i];
			int j=i-1;
			while(j>=0&&arr[j]>temp) {
								
					arr[j+1]=arr[j];
				
				j--;
			}
			arr[j+1]=temp;
		}
		for(int k=0;k<size;k++) {
			System.out.print(arr[k]+" ");
		}
	}
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		
		int size=s.nextInt();
		int a[]=take_input(size);
		ascending(a);
	}
	

}
