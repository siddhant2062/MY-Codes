package i_fraction_class;

import java.util.Scanner;

public class Fraction_main {
	public static void main(String args[]) {
		Fraction f1 = new Fraction(20, 30);
		f1.print();// 2/3
		f1.setNumerator(12);
		f1.print();// 4
		int d = f1.getDenominator();
		System.out.println(d);// 1
		f1.setNumerator(10);
		f1.setDenominator(30);
		f1.print();// 1/3

		Fraction f2 = new Fraction(3, 4); //non static
		f1.add(f2);
		f1.print(); // 13/12 new f1 value
		f2.print(); // 3/4

		Fraction f3 = new Fraction(4, 5); //non static
		f3.multiply(f2);
		f3.print(); // 3/5
		
		Fraction f4=Fraction.add(f1,f3); //static
		f1.print();
		f3.print();
		f4.print();

	}
}
