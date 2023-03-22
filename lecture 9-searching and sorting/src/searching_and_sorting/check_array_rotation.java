package searching_and_sorting;
import java.util.Scanner;
public class check_array_rotation {
	public static int[] take_input(int size) {
		Scanner s=new Scanner(System.in);
		
		int a[]=new int[size];
		for(int i=0;i<size;i++) {
			a[i]=s.nextInt();
		}
		return a;
	}

  public static void rotation(int arr[]) { //we have to find the index when ascending order ends and another order starts
	 
	  int size=arr.length;
	  for(int i=0;i<size-1;i++) {
		  if(arr[i]>arr[i+1]) {
			  System.out.print(i+1);
			  return;
		  }
	  }
	  System.out.println("0");	  
  }
  public static void main(String args[]) {
	  Scanner s=new Scanner(System.in);
	  
	  int size=s.nextInt();
	  int a[]=take_input(size);
	  rotation(a);
  }
} 
