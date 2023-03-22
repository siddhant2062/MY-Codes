package bubble_sorting;
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
		int temp=0;
		for(int i=0;i<size;i++) {		
			for(int j=0;j<size-1;j++){
				if(arr[j]>arr[j+1]) {
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					
				}
							
			}
			
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
