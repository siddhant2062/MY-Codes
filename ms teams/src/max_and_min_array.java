import java.util.Scanner;

public class max_and_min_array {

	public static int[] take_input() {
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int arr[] = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}

	public static int maximum(int arr[]) {
		int size = arr.length;
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < size; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}

		}
		return max;

	}

	public static int minimum(int arr[]) {
		int size = arr.length;
		int min = arr[0];
		for (int i = 0; i < size; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		return min;

	}

	public static void main(String[] args) {

		int a[] = take_input();
		int max = maximum(a);
		int min = minimum(a);
		System.out.println("the maximum no in array is " + max + " and the minimum no in array is " + min);

	}

}
