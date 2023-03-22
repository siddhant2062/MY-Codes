package stack;
import java.util.*;
public class Stack_1 {
	public static void main(String args[]) {
		Stack<Integer> s1=new Stack();
		s1.push(110);
		s1.push(20);
		s1.push(30);
		s1.push(40);
		System.out.println(s1);
		s1.pop();
		System.out.println(s1);
//		s1.peek();
		System.out.println(s1.peek());
	}

}
