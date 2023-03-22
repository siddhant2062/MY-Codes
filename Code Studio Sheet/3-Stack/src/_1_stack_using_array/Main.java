package _1_stack_using_array;
import java.util.*;
public class Main{
//	private int top;
//	private int[] data;
//	Main(){
//		top=-1;
//		data=new int[10];
//	}
	public static void main(String args[]) throws StackEmptyException {
		Stack stack=new Stack();
		try {
			stack.push(10);
		} catch (StackFullException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(stack.pop());
	}
}
