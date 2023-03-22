package ii_complex_no_class;

import java.util.*;

public class Complex_main {
	public static void main(String args[]) {
		Complex c1=new Complex(2,3);
		c1.print(); //2+3i
		c1.setReal(10); 
		c1.setImage(30);
		c1.print();//10+30i
		
		Complex c2=new Complex(1,5);
		c1.add(c2);
		c1.print();//11+35i
		c2.print();//1+5i
		
		Complex c3=new Complex(3,2);
		c3.multiply(c2);
		c3.print(); //3+10i
		c2.print(); //1+5i
		
		Complex c4=Complex.add(c1,c3);
		c1.print();//11+35i
		c3.print();//3+10i
		c4.print();//14+45i
		
		//Complex c5=c1.conjugate();//conjugate of a+ib=a-ib and vice versa   
	}

}
