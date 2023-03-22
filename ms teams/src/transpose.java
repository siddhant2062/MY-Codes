import java.util.Scanner;
public class transpose {
	public static int[][] take_input(int rows,int cols) {
		Scanner s=new Scanner(System.in);
		
		System.out.println("enter array elements:");
		int arr[][]=new int[rows][cols];
		for (int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				arr[i][j]=s.nextInt();
			}			
		}
		return arr;
	}
	public static void print(int a[][]) {
		System.out.println("transpose of array:");
		int rows=a.length;
		int cols=a[0].length;
		for(int i=0;i<rows;i++) {
			for (int j=0;j<cols;j++) {
			    System.out.print(a[i][j]+" ");
		}
			System.out.println();
			
	}
	}
	public static void transpose(int arr[][]) {
		int rows=arr.length;
		int cols=arr.length;
		int transpose[][]=new int[rows][cols];
		for(int i=0;i<rows;i++) {
			for (int j=0;j<cols;j++) {
				transpose[i][j]=arr[j][i];
			}
			
		}
		print(transpose);
		
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.println("enter size of the row:");
		int rows=s.nextInt();
		System.out.println("enter size of the column:");
		int cols=s.nextInt();
		int arr[][]=take_input(rows,cols);
		transpose(arr);
	
		
		
		

	}

}
