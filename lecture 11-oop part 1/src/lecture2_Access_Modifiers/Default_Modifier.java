//when the access modifier is default than it is accessible only in same class, same package sub-class, same package non-sub-class
//note:- only public and default access modifier can be used for class.
package lecture2_Access_Modifiers;

class Feature {//here we didn't assign any modifier before class feature....so the access modifier is default
	void show() {
		System.out.println("i am Show");
	}

	int a=10;
}

class Default_Modifier {//here also we didn't assign any modifier before class Default_Modifier ....so the access modifier is default.
	public static void main(String args[]) {
		Feature f1 = new Feature();
		f1.show();
		System.out.println(f1.a);

	}

}
