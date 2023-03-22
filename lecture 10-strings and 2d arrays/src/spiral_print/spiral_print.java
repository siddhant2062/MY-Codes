package spiral_print;
import java.util.Scanner;
public class spiral_print {
	public static int[][] take_input(int row,int col){
		Scanner s=new Scanner(System.in);
		
		int arr[][]=new int[row][col];
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				arr[i][j]=s.nextInt();
			}
		}
		return arr;
		
	}
	public static void spiral(int arr[][]) {
		
		int row=arr.length;
		int col=arr[0].length;
		int rowstart=0;
		int colstart=0;
		int count=0;
		int i;
		int size=row*col;
		while(count<size) {
			for(i=colstart;i<col;i++) {
				System.out.print(arr[rowstart][i]+" ");
				count++;
			}
			rowstart++;
			for(i=rowstart;i<row;i++) {
				System.out.print(arr[i][col-1]+" ");
				count++;
			}
			col--;
			for(i=col-1;i>=colstart;i--) {
				System.out.print(arr[row-1][i]+" ");
				count++;
			}
			row--;
			for(i=row-1;i>=rowstart;i--) {
				System.out.print(arr[i][colstart]+" ");
				count++;				
			}
			colstart++;
		}
	}
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		
		int row=s.nextInt();
		int col=s.nextInt();
		int arr[][]=take_input(row,col);
		spiral(arr);
	}

}
