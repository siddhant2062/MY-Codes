//private modifier is very restricted modifier ......it is accessible only in its class neither in its sub_class nor different package class. 
package lecture2_Access_Modifiers;

class Private_Use{//class cannot be private
	 void show() {
		System.out.println("i am not private");
	}
	 private void show1() {
		System.out.println("i am private");
	}
	 private int a=10;
}
class Private_Modifier {
	public static void main(String args[]) {
		Private_Use p1=new Private_Use();
		p1.show();
//		p1.show1(); it will give an error because private cannot be accessed from sub class .
	}
	
}
