package i_fraction_class;

import java.util.*;

public class Fraction {
	private int numerator;
	private int denominator;

	public Fraction(int numerator, int denominator) {
		this.numerator = numerator;
		if (denominator == 0) {
			// TODO error out
		}
		this.denominator = denominator;
		simplify();
	}

	private void simplify() {
		int gcd = 1;
		int smaller = Math.min(numerator, denominator);
		for (int i = 2; i <= smaller; i++) {
			if (numerator % i == 0 && denominator % i == 0) {
				gcd = i;
			}
		}
		numerator = numerator / gcd;
		denominator = denominator / gcd;

	}

	public void print() {
		if (denominator == 1) {
			System.out.println(numerator);

		} else {
			System.out.println(numerator + "/" + denominator);
		}
	}

	public void setNumerator(int numerator) {
		this.numerator = numerator;
		simplify();
	}

	public void setDenominator(int denominator) {
		if (denominator == 0) {
			// TODO error out
			return;
		}
		this.denominator = denominator;
		simplify();
	}

	public int getDenominator() {
		return denominator;
	}

	public int getNumerator() {
		return numerator;
	}

	public static Fraction add(Fraction f1, Fraction f3) { //static
		int new_num=f1.numerator*f3.denominator+(f3.numerator*f1.denominator);
		int new_den=f1.denominator*f3.denominator;
		Fraction f=new Fraction(new_num,new_den);
		
		return f;
	}

	public void add(Fraction f2) { //non static
		this.numerator = this.numerator * f2.denominator + this.denominator * f2.numerator;
		this.denominator = this.denominator * f2.denominator;
		simplify();
	}

	public void multiply(Fraction f2) { //non static
		this.numerator = this.numerator * f2.numerator;
		this.denominator = this.denominator * f2.denominator;
		simplify();
	}

}