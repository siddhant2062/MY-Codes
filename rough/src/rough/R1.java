package rough;

public class R1 {
	int i=1;
	
	void print() {
		System.out.println(add(5,6));
	}
	
	static int add(int a, int b) {
		int sum=a+b;
		return sum;
		
	}
	public static void main(String args[]) {
		R1 obj=new R1();
		obj.i++;
		System.out.println(obj.i);
//		add(1,2);
		obj.print();
	}
}
