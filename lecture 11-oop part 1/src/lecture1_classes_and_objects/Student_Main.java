//Non-Primitive data types in java are also called reference types because they refer to objects.here reference of objects means address of objects Non-primitive data types are created by the programmer and they are not predefined. Since non-primitives are referred to as objects they can be assigned with null, which is not a case in primitive type.Examples of Non-primitive datatypes are String, Arrays, Class and Objects.
package lecture1_classes_and_objects;

import java.util.Scanner;

class Student_Main {
	Scanner s = new Scanner(System.in);// here scanner is a class and here we taken s as an object of Scanner class

	public static void main(String args[]) {
		Student s1 = new Student();
		Student s2 = new Student(); /*
									 * this new Student() create a new object or allocate memory with containing
									 * properties of name and roll which we had assign in class student. Here s1 and
									 * s2 are not actually objects but have reference or address stored of new
									 * Student object() in its stack memory.
									 */
		System.out.println(s1);/*
								 * this will print new Student() object address along with its package and class
								 * name i.e., lecture1_classes_and_objects.Student@9e89d68 because s1 stores
								 * address of new student object........Similar will be happen if we print s2,
								 * it will also print new Student() object address along with its package and
								 * class name, the only difference will be in their address of storing new
								 * Student() object
								 * 
								 */

//		now we will access class members using object by dot notation
		System.out.println(s1.name + " " + s1.roll);// it will give null and 0
		System.out.println(s2.name + " " + s2.roll);// it will give null and 0
//the reason due to which it gave null and 0 as output because if we don't assign anything in an Non-primitive datatype than the default value it take is null, here name is a String variable which is a Non-primitive datatype whereas if we don't assign anything in an primitive datatype than the default value it take is 0, here roll is  an integer variable.

		// we can also assign values to the class Student members with the help of dot notation

		s1.name = "Siddhant Kumar Srivastava";
		s1.roll = 2010990685;
		s2.name = "Aadarsh kumar Srivastava";
		s2.roll = 2010990686;
		System.out.println(s1.name + " " + s1.roll);
		System.out.println(s2.name + " " + s2.roll);

		// we can create objects in multiline also
		Student s3; // declaring reference
		s3 = new Student();// allocating memory
	}

}
