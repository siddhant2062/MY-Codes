package linked_list;

import java.util.*;

public class ll_1 {
	public static void main(String args[]) {
		Vector<String> v = new Vector<>();
		v.add("Siddhant");
		v.add("Kumar");
		v.add("Srivastava");
		System.out.println("Vector:" + v);
		v.setElementAt("Shubham", 0);
		System.out.println("the new vector: " + v);
		v.removeElementAt(1);
		System.out.println("the new vector: " + v);
		v.insertElementAt("Siddhant", 2);
		System.out.println("the new vector: " + v);
		v.addElement("2010990685");
		System.out.println("the new vector: " + v);

	}

}
