package ms_teams_1;

class Father { // Base Class
	int a = 10; // Instance Variable

	int add(int y) { // Method
		int b = y;
		return (a + b);
	}

}

interface Mother {// Interface
	int c = 30;// public static final

	void disp();// Abstract Method

}

//interface Sister {
//	int c = 100;
//}

class Son extends Father implements Mother {// extends and implements together
	int m = a * Mother.c;// accessing class and interface variable
	int sum = add(20);

	public void disp() { // Defining Interface Abstract Method
		System.out.println("Addition = " + sum);
		System.out.println("Multiplication = " + m);
	}
}

interface Interface {
	public static void main(String args[]) {
		Son obj = new Son();
		obj.disp();

	}

}



