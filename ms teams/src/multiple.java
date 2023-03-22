class G {
	void show() {
		System.out.println("i am G");
	}
}

class H {
	void show1() {
		System.out.println("i am H");
	}
}

class I extends G,H{//it is giving error because multiple inheritance is not possible in class .....it is only possible in interfaces

	void show2() {
		System.out.println("i am I");
	}
}

public class multiple {
	public static void main(String args[]) {
		I g = new I();

	}
}
