import java.util.Scanner;

public class overloading_Use {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		overloading o1 = new overloading();
		int r = s.nextInt();
		int l = s.nextInt();
		int b = s.nextInt();
		o1.area(r);
		o1.area(l, b);

	}
}

class overloading {
	public void area(int r) {
		System.out.println("Area of circle = " + r * r * 3.14);
	}

	public void area(int l, int b) {
		System.out.println("Area of rectangle= " + l * b);
	}

}
