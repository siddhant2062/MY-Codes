package two_dimesional_arrays;
import java.util.Scanner;
public class largest_row_or_column {
	public static int[][] take_input(int rows,int cols){
		Scanner s=new Scanner(System.in);		
		
		int a[][]=new int[rows][cols];
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				a[i][j]=s.nextInt();
			}
		}
		return a;
	}
	public static void largest_row_or_column(int arr[][]) {
		
		int rows=arr.length;
		int cols=arr[0].length;
		int largest=Integer.MIN_VALUE;
		boolean isa=true;
		
		int col_index=0;
		int row_index=0;
		for(int j=0;j<cols;j++) {
			int sum_col=0;
		for(int i=0;i<rows;i++) {
				 sum_col=sum_col+arr[i][j];			 
			}
			if(sum_col>largest) {
				largest=sum_col;
				col_index=j+1;
			}	
		}
		for(int i=0;i<rows;i++) {
		
			int sum_row=0;
			for(int j=0;j<cols;j++) {
				sum_row=sum_row+arr[i][j];
			}
			if(sum_row>largest) {
				isa=false;
				largest=sum_row;
				row_index=i+1;
			}
		}
		if(isa) {
		System.out.println("column" +" "+col_index+" "+largest);
		}else {
			System.out.println("row"+" "+row_index+" "+largest);
		}
		
	}

	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		
		int rows=s.nextInt();
		int cols=s.nextInt();
		if(rows==0) {
			System.out.println("row "+"0 "+Integer.MIN_VALUE);
			return;
		}
		int a[][]=take_input(rows,cols);
		largest_row_or_column(a);			
		}		
	}


