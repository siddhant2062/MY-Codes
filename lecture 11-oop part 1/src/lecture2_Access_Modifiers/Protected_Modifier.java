//protected modifier:- when the access modifier is protected than it is accessible only in same class, same package sub-class, same package non-sub-class and different package sub-class.
package lecture2_Access_Modifiers;

import temp.Protected_Sub_Class;

class Protected_Modifier extends Protected_Sub_Class {// class cannot be protected
	public static void main(String args[]) {
		Protected_Sub_Class p1=new Protected_Sub_Class();
		
		int a=p1.aa;
		System.out.println(a);
		

	}
}
