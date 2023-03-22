package collection_and_generics;

//import java.util.List;

class Container<T> {
	
	private T value;
	
	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}

	

	void show() {
		System.out.println(value.getClass().getName());
	}

}

class Generics_1 {
	public static void main(String args[]) {
		
		Container<Integer> obj=new Container<Integer>();
		Container<String> obj1=new Container<String>();
		obj.setValue(10);
		obj.show();
		System.out.println(obj.getValue());
		obj1.setValue("hello");
		System.out.println(obj1.getValue());
		obj1.show();
		
		
	}

}


