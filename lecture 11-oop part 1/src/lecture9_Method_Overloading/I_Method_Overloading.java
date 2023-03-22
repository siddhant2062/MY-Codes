//When more than one method with the same name is defined in the same class, it is known as method overloading.
package lecture9_Method_Overloading;

class Addition {
	void disp(int a, int b) {// instance method
		int x = a;
		int y = b;
		int z = x + y;
		System.out.println("Addition = " + z);
	}

	void disp(int a, float b) {// instance method
		int x = a;
		float y = b;
		float z = x + y;
		System.out.println("Addition = " + z);
	}

	void disp(double a, double b) {// instance method
		double x = a;
		double y = b;
		double z = x + y;
		System.out.println("Addition = " + z);
	}

	void disp(int a, float b, double c) {// instance method
		int x = a;
		float y = b;
		double z = c;
		double sum = x + y + z;
		System.out.println("Addition = " + sum);
	}
//	in method overloading all method names are same except the parameters in the method
}

public class I_Method_Overloading {
	public static void main(String[] args) {
		Addition obj = new Addition();
		int a = 2;
		float b = 2.1f;
		double c = 33.3;
		obj.disp(a, a);
		obj.disp(a, b);
		obj.disp(c, c);
		obj.disp(a, b, c);

	}
}
