package ms_teams_1;

import java.util.Scanner;

interface A // base class
{
	int min = 10;

	void a();
}

interface B // base class
{
	void b();
}

interface C // base class
{
	void c();
}

class D implements A, B, C // sub class
{
	public void a() {
		System.out.println("HEllo A class");
	}

	public void b() {
		System.out.println("HEllo B class");
	}

	public void c() {
		System.out.println("HEllo C class");
	}

//	void d() {
//		System.out.println("HEllo D class");
//		System.out.println("The value of minimum variable is" + min);
//	}
}

class E {
	public static void main(String x[]) {
		D d1 = new D();
		d1.a();
		d1.b();
		d1.c();
//		d1.d();
//System.out.println("The value of minimum variable is"+d1.min);
	}
}
