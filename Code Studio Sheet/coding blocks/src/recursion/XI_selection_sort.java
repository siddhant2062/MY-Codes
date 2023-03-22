package recursion;
import java.util.*;
public class XI_selection_sort {
	static void selection(int i,int j,int arr[],int size) {
		if(i==size-1) {
			return;
		}
		if(j<size) {
			if(arr[i]>arr[j]) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
			selection(i,++j,arr,size);
		}else {
			selection(++i,i+1,arr,size);
		}
	}
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		int size=s.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=s.nextInt();
		}
		int index=0;
		selection(index,index+1,arr,size);
		for(int j=0;j<size;j++) {
			System.out.print(arr[j]+" ");
		}
	}

}
