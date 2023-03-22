package recursion;
import java.util.*;
public class X_bubble_sort {
	static void bubble(int arr[],int i,int j) {
		if(i==0) {
			return;
		}
		if(j<i) {
			if(arr[j]>arr[j+1]) {
			int temp=arr[j];
			arr[j]=arr[j+1];
			arr[j+1]=temp;			
			}
			bubble(arr,i,++j);
		}else {
			bubble(arr,--i,0);
		}
		
	}
public static void main(String args[]) {
	Scanner s=new Scanner(System.in);
	int size=s.nextInt();
	int arr[]=new int[size];
	for(int i=0;i<size;i++) {
		arr[i]=s.nextInt();		
	}
	int i=size-1;
	bubble(arr,i,0);
	for(int j=0;j<size;j++) {
		System.out.print(arr[j]+" ");
	}
}
}
