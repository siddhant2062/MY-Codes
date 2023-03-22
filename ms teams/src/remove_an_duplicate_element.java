import java.util.Scanner;
public class remove_an_duplicate_element {
	public static int[] take_input() {
		Scanner s=new Scanner(System.in);
		
		System.out.println("enter size of the array:");
		int size=s.nextInt();
		System.out.println("enter array elements:");
		int arr[]=new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=s.nextInt();
		}
		return arr;
	}
	public static void print(int arr[]) {
		int size=arr.length;
		System.out.println("removed duplicates from an array");
		for(int i=0;i<size;i++) {
			if(arr[i]==Integer.MIN_VALUE) {
				continue;
			}
			System.out.print(arr[i]+" ");
			
		}
			
	}
	public static int[] remove_duplicates(int arr[]) {
		int size=arr.length;
		int temp=0;
		for(int i=0;i<size;i++) {
			for(int j=i+1;j<size;j++) {
				if(arr[i]==arr[j]) {
					arr[j]=Integer.MIN_VALUE;					
			}
		}
	}
	return arr;
}
	
	
	
	public static void main(String[] args) {
		int a[]=take_input();
		int b[]=remove_duplicates(a);
		print(b);
		

	}

}
