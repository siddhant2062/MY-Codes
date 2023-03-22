package lecture7_constructor;

class Test {
	int a;
	int b;

	Test() {
		this(10, 20);
		System.out.print("constructor one ");
	}

	Test(int a, int b) {
		this.a = a;
		this.b = b;
		System.out.print("constructor two ");
	}
}

class Constructor_Example2 {
	public static void main(String[] args) {
		Test object = new Test();
	}
}

/*
 * Solution Description:
 *  When the object of Test class is created,the constructor
 * with no arguments is called. When this(10,20) is encountered , the
 * constructor with two arguments int and int is called because this is the
 * reference of the object. So using this way we can call more than one
 * constructor.
 */
