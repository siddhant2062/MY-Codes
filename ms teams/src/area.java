import java.util.Scanner;
public class area {
	
	public static double area(int r) {
		 double circle=(3.14*r*r);
		 return circle;
	}
	public static double area(int l,int b) {
		 double rectangle=l*b;
		 return rectangle;
	}

	public static void main(String[] args) {
		System.out.println(area(1));
		System.out.println(area(3,5));

	}

}
