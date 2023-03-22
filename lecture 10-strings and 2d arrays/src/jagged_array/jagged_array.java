package jagged_array;

public class jagged_array {
	public static void main(String args[]) {
		int arr[][]=new int[3][4];//square box in which their is size 3 typed, it is actually address to the 1-d array and the another square box in which 4 is typed is size of the row for that specific 1-d array
		System.out.println(arr);//it will print whole 2-d array address
		System.out.println(arr[0]);//it will print 1-d array addresss
		System.out.println(arr[0][0]);// it will print 0 because by default when we create array its all entries are initialise as zero

		
		int arr2[][]=new int[4][];
		System.out.println(arr2[0]);//it will not give an 1-d array address instead it will give null because we had not assign row size for 1-d array 
		//System.out.println(arr2[0][0]);//it will give null Pointer exception because, as row size is not assigned for 1-d array so it can't go to null array's 0th index and read. So, it gives an null point exception
	
		for(int i=0;i<arr2.length;i++) {
			arr2[i]=new int[2];//here an 1-d array created of size 2 and stored in arr2 ith zero index
		    System.out.println(arr2[i]);
		}
		
		//now creating a jagged array, in a jagged array all the 1-d array has different row sizes.
		System.out.println();
		int arr3[][]=new int[5][];
		for(int i=0;i<arr3.length;i++) {
			arr3[i]=new int[i+2];//here we added i for different row sizes		
		}
		for(int i=0;i<arr3.length;i++) {
			for(int j=0;j<arr3[i].length;j++) {
				System.out.print(arr3[i][j]+" ");
			}
			System.out.println();
		}
	}

}
