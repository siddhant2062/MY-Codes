package rough;
import java.util.Scanner;
public class rough {
	public static int[] take_input(int size) {
		Scanner s=new Scanner(System.in);
		
		int arr[]=new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=s.nextInt();
		}
		return arr;
		
	}
	//public static void nearest

}
