package arrays;
import java.util.Scanner;
public class sort_0_1 {
	public static int[] take_input(int size) {
	Scanner s=new Scanner(System.in);
	
	int a[]=new int[size];
	for(int i=0;i<size;i++) {
		a[i]=s.nextInt();
	}
	return a;
	}
	public static void sortZeroesAndOne(int[] arr) {
		
		int size=arr.length;
		int count=0;
		for(int i=0;i<size;i++) {
			if(arr[i]==0) 
				count++;			
		}
		for(int j=0;j<count;j++) {
			arr[j]=0;
			System.out.print(arr[j]+" ");
		}
		for(int k=count;k<size;k++) {
			arr[k]=1;
			System.out.print(arr[k]+" ");
		}

	}
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		
		int size=s.nextInt();
		int a[]=take_input(size);
		sortZeroesAndOne(a);
	}
	

}
