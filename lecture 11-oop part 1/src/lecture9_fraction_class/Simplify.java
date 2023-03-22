package lecture9_fraction_class;

public class Simplify {
	private int numerator;
	private int denominator;

	Simplify(int numerator, int denominator) {
		this.numerator = numerator;
		this.denominator = denominator;
		simplify_fraction();
	}

	private void simplify_fraction() {
		int gcd=1;
		int small=Math.min(numerator, denominator);
		for(int i=2;i<=small;i++) {
			if(numerator%i==0 && denominator%i==0) {
				gcd=i;
			}			
		}
		numerator=numerator/gcd;
		denominator=denominator/gcd;
	}
	
	public void print() {
		System.out.println(numerator+"/"+denominator);
		
	}
}
