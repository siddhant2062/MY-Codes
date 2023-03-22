import java.util.*;
public class rough2 {
	static void func(int arr[]) {
		arr[0]=10;
	}
public static void main(String args[]) {
	Scanner s=new Scanner(System.in);
	int arr[]=new int[10];
	for(int i=0;i<10;i++) {
		arr[i]=s.nextInt();
	}
	func(arr);
	for(int i=0;i<10;i++) {
		System.out.print(arr[i]+" ");
	}
}
}
