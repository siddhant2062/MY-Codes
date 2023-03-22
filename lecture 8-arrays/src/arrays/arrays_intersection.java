package arrays;
import java.util.Scanner;
public class arrays_intersection {
	public static int[] take_input(int size) {
	Scanner s=new Scanner(System.in);
		int a[]=new int[size];		
		for(int i=0;i<size;i++) {
			a[i]=s.nextInt();			
		}	
		return a;
	
	}
	public static int[] take_input1(int size) {
		Scanner s=new Scanner(System.in);
		int a[]=new int[size];
		for(int i=0;i<size;i++) {
			a[i]=s.nextInt();
			
		}
		return a;			
	}
	public static void intersections(int arr1[],int arr2[]) {
		
		int size=arr1.length;
		int size1=arr2.length;
		for(int i=0;i<size;i++) {
		
			
			for(int j=0;j<size1;j++) {
				if(arr1[i]==arr2[j]) {
					System.out.print(arr1[i]);				
					arr2[j]=Integer.MIN_VALUE;
					break;
				}
			}
	    }
	}
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		
		int size=s.nextInt();
		int a[]=take_input(size);
		int size1=s.nextInt();
		int b[]=take_input1(size1);
		intersections(a,b);
		
	}
	
}