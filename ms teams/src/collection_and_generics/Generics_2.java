package collection_and_generics;

class Containerr<T, U> {

	T obj1;
	U obj2;

	Containerr(T obj1, U obj2) {
		this.obj1 = obj1;
		this.obj2 = obj2;
		this.print();
	}

	void print() {
		System.out.println(obj1 + " " + obj2);
	}
}

class Generics_2 {
	public static void main(String args[]) {

		Containerr<Integer, String> obj1 = new Containerr<Integer, String>(2010990685, "Siddhant Kumar Srivastava");
	}
}
