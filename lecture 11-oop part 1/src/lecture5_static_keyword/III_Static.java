package lecture5_static_keyword;

import java.util.Scanner;

class MCQ {
	static int a = 10;
	int b = 20;

	static void fun1() {
		a = 20; // Line 1
		b = 10; // Line 2 static member cannot use non static data variables
		fun2(); // Line 3 static member cannot use non static functions
		System.out.print(this.b); // Line 4 this and super cannot be used in static context 
		this.a=30; 
	}

	void fun2() {
		System.out.println("from m2");
	}
}

class III_Static{    
		    public static void main(String[] args) 
		    { 
		    	MCQ.fun1(); 
		    } 
		}


