package lecture3_getters_and_setters;

import java.util.Scanner;

class Get_And_Set_Main {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		Get_And_Set p1 = new Get_And_Set();
//		p1.name="sid";......we cannot access the private data members of class Player directly.....we have to use getter and setter method for that
		p1.setName("siddharrt"); // setting the value
		System.out.println(p1.getName()); // getting that value
	}

}
