package ii_complex_no_class;

public class Complex {
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
	void add(Complex c2) {
		this.real=this.real+c2.real;
		this.image=this.image+c2.image;
	}
	void multiply(Complex c2) {
		int newReal=((this.real)*(c2.real))-(this.image*c2.image);
        int newImage=(this.real*c2.image)+(this.image*c2.real);
        this.real=newReal;
        this.image=newImage;
	}
	static Complex add(Complex c1,Complex c3) {
		int new_real=c1.real+c3.real;
		int new_image=c3.image+c1.image;
		Complex c=new Complex(new_real,new_image);
		return c;
	}
	/*Complex conjugate() {// 
		
//		String str="a+ib";
//		String ans=str.contains("+")?str.replace('+','-'):str.replace('-','+');
		
	}*/
}
