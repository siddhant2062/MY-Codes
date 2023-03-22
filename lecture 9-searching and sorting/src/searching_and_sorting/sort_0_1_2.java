package searching_and_sorting;
import java.util.Scanner;
public class sort_0_1_2 {
	public static int[] take_input(int size) 
	{
		Scanner s=new Scanner(System.in);
		
		int a[]=new int[size];
		for(int i=0;i<size;i++)
		{
			a[i]=s.nextInt();
		}
		return a;
    }
    public static void sort(int arr[])
    {

    	int size=arr.length;
    	int temp=0;
    	for(int i=0;i<size;i++) {
    		if(arr[i]==0)
    		{
    		temp++;	
    		}
    	}
    	for(int i=0;i<temp;i++) {
    		arr[i]=0;
    		System.out.print(arr[i]+" ");
    	}
    	
    	
    	int count =0;
    	for(int i=0;i<size;i++) {
    		if(arr[i]==1) {
    			count++;
    		}
    	}
    	for(int i=0;i<count;i++) {
    		arr[i]=1;
    		System.out.print(arr[i]+" ");
    	}
    	
    	for(int i=(temp+count);i<size;i++) {
    		arr[i]=2;
    		System.out.print(arr[i]+" ");
    	}
    }
    public static void main(String args[]) {
    	Scanner s=new Scanner(System.in);
    	
    	int size=s.nextInt();
    	int a[]=take_input(size);
    	sort(a);
    }
}
