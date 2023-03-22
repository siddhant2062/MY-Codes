//The final keyword is a non-access modifier used for classes, attributes and methods, which makes them non-changeable (impossible to inherit or override). 

/*
 * final variable can be initialized only once and cannot be modified further
 * we can initialize final variable inside a constructor
 * final keyword is non-access modifier 
 */
//note:-anything which is final we can initialize it only on two places. 
//* we can initialize side by side at the time of creation when we have used final keyword.
//* we can initialize via constructor

package lecture8_final_keyword;

class Final {
	final int roll;
	String name;

	Final(int roll, String name) {

		this.roll = roll;
		this.name = name;
		System.out.println(this.roll + " " + this.name);
	}


}

class Final_keyword {
	public static void main(String args[]) {
		Final f1 = new Final(20, "siddhant");
		f1.name = "aadarsh";// here we can change name because it has no final keyword
//		f1.roll=20;  it will generate an error because  we can't change roll because it has final keyword
	

	}

}
