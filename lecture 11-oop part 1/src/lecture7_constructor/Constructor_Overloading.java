package lecture7_constructor;

class Overloading {
	String name;
	int roll;

	Overloading() {
		this("siddhant");// note:-constructor call must be first statement in a constructor........here this is the current object of the constructor i.e., Overloading(String name)
		System.out.println("Default");

	}

	Overloading(String name) {
		this("siddhant", 21);
		this.name = name;
		System.out.println(this.name);
	}

	Overloading(String name, int roll) {
		this.name = name;
		this.roll = roll;
		System.out.println(this.name + " " + this.roll);
	}

	Overloading(int roll, String name) {
		this.name = name;
		this.roll = roll;
		System.out.println(this.name + " " + this.roll);
	}

}

class Constructor_Overloading {
	public static void main(String args[]) {

		Overloading o1 = new Overloading();// it will call the default constructor
		Overloading o2=new Overloading(21,"Sid");

	}

}
//A default constructor is a constructor which can be called with no arguments (either defined with an empty parameter list, or with default arguments provided for every parameter). 
