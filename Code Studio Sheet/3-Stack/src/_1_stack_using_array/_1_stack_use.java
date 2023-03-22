package _1_stack_using_array;
import java.util.*;
public class _1_stack_use {
	public static void main(String args[]) throws StackFullException, StackEmptyException  {
		Stack stack=new Stack();
		for(int i=0;i<=20;i++) {
			stack.push(i);
		}
		while(!stack.isEmpty()) {
			System.out.println(stack.pop());
		}
		System.out.println(stack);
		
	}
}
