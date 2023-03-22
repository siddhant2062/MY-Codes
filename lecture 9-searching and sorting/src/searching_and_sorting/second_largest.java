package searching_and_sorting;
import java.util.Scanner;
public class second_largest {
	public static int[] take_input(int size) {
		Scanner s=new Scanner(System.in);
		
		int a[]=new int[size];
		for(int i=0;i<size;i++) {
			a[i]=s.nextInt();
		}
		return a;
	}
	public static void second_largest(int arr[]) {
		
		int size=arr.length;
		int i=0;
		int temp=0;
		while(i<size-1&&size>1) {
			if(arr[i]==arr[i+1]) {
				temp++;
			}
			i++;
			 if(temp==(size-1)) {
			System.out.print(-214748368);
			return;
		}
	}
			 if(size<=1) {
				 System.out.print(-214748368);
				 return;
			 }
		
		
	
		for(int j=0;j<size;j++) {
			for(int k=j+1;k<size;k++) {
				if(arr[j]>arr[k]) {
					int tempo=arr[j];
					arr[j]=arr[k];
					arr[k]=tempo;
				}
				
			}					
		}
		System.out.print(arr[size-2]);	
	}
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		
		int size=s.nextInt();
		int a[]=take_input(size);
		second_largest(a);
		
	}

}
