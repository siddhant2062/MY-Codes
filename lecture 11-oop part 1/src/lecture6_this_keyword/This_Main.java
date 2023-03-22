//The this keyword refers to the current object in a method or constructor. The most common use of the this keyword is to eliminate the confusion between class attributes and parameters with the same name (because a class attribute is shadowed by a method or constructor parameter).
package lecture6_this_keyword;

class This_Main {
	public static void main(String args[]) {
		This t1=new This() ;
		
		System.out.println(t1);//here it will give the address of the t1 object......and we can observe that the address of the t1 and this in class This is same
		t1.setRoll(100);
		System.out.println(t1.getRoll());
	
	}

}
