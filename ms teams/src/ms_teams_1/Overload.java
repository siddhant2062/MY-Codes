package ms_teams_1;

import java.util.Scanner;

class Overloading {
	int add(int x, int y) {
		int sum = x + y;
		return sum;
	}

	int add(int x, int y, int z) {
		int sum = x + y + z;
		return sum;
	}

	int add(double x, int y) {
		int sum = (int) (x + y);
		return sum;
	}

	int add(int x, double y) {
		int sum = (int) (x + y);
		return sum;
	}
}

class Overload {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		Overloading o1 = new Overloading();
		int x = s.nextInt();
		int y = s.nextInt();
		int z = s.nextInt();
		double a = s.nextDouble();
		double b = s.nextDouble();
		System.out.println(o1.add(x, y));
		System.out.println(o1.add(x, y, z));
		System.out.println(o1.add(a, y));
		System.out.println(o1.add(x, b));

	}

}
