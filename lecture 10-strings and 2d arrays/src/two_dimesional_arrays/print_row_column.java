package two_dimesional_arrays;
import java.util.Scanner;
public class print_row_column {
	public static int[][] take_input(int rows,int cols) {
		Scanner s=new Scanner(System.in);
		
		int arr[][]=new int[rows][cols];
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				System.out.println("enter element at "+i+" row "+j+" column");
				arr[i][j]=s.nextInt();
			}
		}
		
		return arr;
	
		
	}
    public static void print(int arr[][]) {
      int rows=arr.length;
       int cols=arr[0].length;
    	for(int i=0;i<rows;i++) {
    		for(int j=0;j<cols;j++) {
    			
    			System.out.print(arr[i][j]);
    		}
    		System.out.println();
    	}
    }
    public static void main(String args[]) {
    	Scanner s=new Scanner(System.in);
    	
    	int rows=s.nextInt();
    	int cols=s.nextInt();
    	int arr[][]=take_input(rows,cols);
    	print(arr);
    }
}
