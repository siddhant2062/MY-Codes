//The this keyword refers to the current object in a method or constructor. The most common use of the this keyword is to eliminate the confusion between class attributes and parameters with the same name (because a class attribute is shadowed by a method or constructor parameter).
package lecture6_this_keyword;

class This {
	private int rollno;

	void setRoll(int rollno) {
		System.out.println(this);//here it will give address of the current object
		this.rollno = rollno;//here this.rollno is the current object roll no
	}

	int getRoll() {
		return rollno;
	}

}
