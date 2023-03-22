package rough;

import java.util.*;
		
class Complex{
	private int real;
	private int image;
	Complex(int real, int image){
		this.real=real;
		this.image=image;		
	}
	void print() {
		System.out.println(real+"+"+image+"i");
	}
	void setReal(int real) {
		this.real=real;
	}
	void setImage(int image) {
		this.image=image;
	}
	public Complex conjugate() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
public class rough_8 {
	public static void main(String args[]) {

		Complex c1=new Complex(2,3);
		c1.print(); //2+3i
		c1.setReal(10); 
		c1.setImage(30);
		c1.print();//10+30i
		
		Complex c5=c1.conjugate();//
		c5.print();//
	}

}
