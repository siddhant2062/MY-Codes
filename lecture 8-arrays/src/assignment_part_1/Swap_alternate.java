package assignment_part_1;

import java.util.Scanner;

class Process1 {
	Scanner s = new Scanner(System.in);
	int n;

	Process1(int n) {
		this.n = n;
		this.swap(this.take_input());
	}

	int[] take_input() {
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}

	void swap(int arr[]) {
		
		int temp ;
		for (int i = 0; i < arr.length-1; i = i + 2) {
			temp = arr[i];
			arr[i] = arr[i + 1];
			arr[i + 1] = temp;
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
	
class Swap_alternate {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		new Process1(s.nextInt());

	}

}
