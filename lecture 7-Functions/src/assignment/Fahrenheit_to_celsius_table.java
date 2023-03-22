package assignment;

import java.util.Scanner;

class Process {
	int start;
	int end;
	int step;

	Process(int start, int end, int step) {
		this.start = start;
		this.end = end;
		this.step = step;
		this.conversion();
	}

	void conversion() {
		while (start <= end) {
			int c = ((start - 32) * 5) / 9;
			System.out.println(start + " " + c);
			start = start + step;
		}
	}

}

class Fahrenheit_to_celsius_table {
	private static Scanner s;

	public static void main(String args[]) {
		s = new Scanner(System.in);
		new Process(s.nextInt(), s.nextInt(), s.nextInt());

	}

}
