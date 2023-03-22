package rough;
import java.util.Scanner;

public class Test 
{
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of array");
		int size = sc.nextInt();
		int arr[]=new int[size];
		for(int i=0 ; i<size; i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<size;i++)
		{
			for(int j=i+1; j<size;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			System.out.print(arr[i]+",");
		}
		
	}

}
