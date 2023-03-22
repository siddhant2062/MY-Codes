package assignment_part_1;

import java.util.Scanner;

class Process {
	int n;

	Process(int n) {
		this.n = n;
//		this.take_input(this.n);
//		this.arrange_numbers(this.take_input(this.n));
		this.print(this.arrange_numbers(this.take_input(this.n)));
	}

	int[] take_input(int size) {
		int arr[] = new int[size];
		return arr;

	}

	int[] arrange_numbers(int arr[]) {
		int temp=0;
		for(int i=1;i<=arr.length;i=i+2) {
			arr[temp]=i;
			temp=temp+1;
		}
		for(int i=2;i<=arr.length;i=i+2) {
			arr[temp]=i;
			temp=temp+1;
		}
		return arr;
	}

	void print(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ", ");
		}
	}
}

class Arrange_numbers_in_an_array {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		new Process(s.nextInt());
	}

}
