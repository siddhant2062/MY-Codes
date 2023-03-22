package assignment;

import java.util.Scanner;

class Process1 {
	int n;
	int a = 0;
	int b = 1;
	int c;

	Process1(int n) {
		this.n = n;
		this.fibonacci();
	}

	void fibonacci() {
		while (a < n) {
			c = a + b;
			a = b;
			b = c;

			System.out.print(c + " ");
			if (a == n) {
				System.out.print("\nTrue," + n + " " + "it's a member of fibonacci series");
				return;
			}

		}
		System.out.println("\nFalse," + n + " " + "it's not a memeber of fibonacci series");
	}

}

class Fibonacci_number {

	private static Scanner s;

	public static void main(String args[]) {
		s = new Scanner(System.in);
		new Process1(s.nextInt());

	}

}
