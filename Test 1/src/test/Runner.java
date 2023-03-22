package test;

import java.util.Scanner;
	class ComplexNumbers {
    // Complete this class
     int real;
    int image;
    
    public ComplexNumbers(int real,int image){
        this.real=real;
        this.image=image;
    }
    void plus(ComplexNumbers c2){
        this.real=this.real+c2.real;
        this.image=this.image+c2.image;
    }
    void print(){
        System.out.println(this.real+" + i"+this.image);
    }
    void multiply(ComplexNumbers c2){
        this.real=this.real*c2.real;
        this.image=this.image*c2.image;
    }
};

public class Runner {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int real1 = s.nextInt();
		int imaginary1 = s.nextInt();

		int real2 = s.nextInt();
		int imaginary2 = s.nextInt();

		ComplexNumbers c1 = new ComplexNumbers(real1, imaginary1);
		ComplexNumbers c2 = new ComplexNumbers(real2, imaginary2);

		int choice = s.nextInt();

		 
		if(choice == 1) {
			// Add
			c1.plus(c2);
			c1.print();
		}
		else if(choice == 2) {
			// Multiply
			c1.multiply(c2);
			c1.print();
		}
		else {
			return;
		}
	}
}
