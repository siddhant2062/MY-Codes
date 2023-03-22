package two_dimesional_arrays;
import java.util.Scanner;
public class row_wise_sum {
	public static int[][] take_input(int rows,int cols){
		Scanner s=new Scanner(System.in);
		
		int arr[][]=new int[rows][cols];
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				arr[i][j]=s.nextInt();
				
			}
		}
		return arr;
	}
	public static void sum(int arr[][]) {
		
		int rows=arr.length;
		int cols=arr[0].length;
		for(int i=0;i<rows;i++) {
			int sum=0;
			for(int j=0;j<cols;j++) {
              sum=sum+arr[i][j];		
			}
			System.out.print(sum+" ");			
		}
	}
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		
		int rows=s.nextInt();
		int cols=s.nextInt();
		if(rows==0) {
			return;
		}
		int a[][]=take_input(rows,cols);
		sum(a);
	}
}
