package rough;
import java.util.Scanner;
public class rough_2 {
	public static int[] take_input(int size) {	
		int start=0;
		int end=size-1;
		int var=1;
		int a[]=new int[size];
		for(int i=0;i<size;i++) {
			if(var%2!=0) {
				a[start]=var;
				start=start+1;
			}else {
				a[end]=var;
				end=end-1;
			}
			var=var+1;
		}
		return a;
		

  }
	public static void arrange(int[] arr, int n) {
		
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
	}
		public static void main(String args[]) {
			Scanner s=new Scanner(System.in);
			
		
			int n=s.nextInt();
			for(int i=0;i<n;i++) {
				
			int size=s.nextInt();							
			int a[]=take_input(size);
			arrange(a,size);
		} 
	}
}