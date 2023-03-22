package wave_print;
import java.util.Scanner;
public class wave_print {
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
	public static void wave(int arr[][]) {
		
		int row=arr.length;
		int col=arr[0].length;
		int wave[]=new int[row*col];
		int k=0;
		for(int j=0;j<col;j++) {
			if(j%2==0) {          //0 is an even number
			for(int i=0;i<row;i++) {			
				wave[k]=arr[i][j];
				k++;
			}
			}
				if(j%2!=0) {
					for(int i=row-1;i>=0;i--) {
						wave[k]=arr[i][j];
						k++;
					}
				}			
		}
		int size=row*col;
		for(int i=0;i<size;i++) {
			System.out.print(wave[i]+" ");
		}
	}
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		
		int row=s.nextInt();
		int col=s.nextInt();
		int arr[][]=take_input(row,col);
		wave(arr);
	}

}
