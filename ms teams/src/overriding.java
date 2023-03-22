class Parent{
	void show() {
		System.out.println("i am parent");
	}
}
class Child extends Parent{
//	@Override
	void show() {
		System.out.println("I am child");
	}
}
public class overriding {
	public static void main(String args[]) {
		Parent obj1=new Parent();
		obj1.show();
		Parent obj2=new Child();
		obj2.show();
		
	}
}
