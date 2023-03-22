package _2_stack_using_ll;
import java.util.*;
public class _1_Stack_using_LL_use {
	public static void main(String rags[]) throws StackEmptyException {
		Scanner s=new Scanner(System.in);
		Stack_LL stack=new Stack_LL();
		int n=s.nextInt();
		System.out.println(stack.isEmpty());
		for(int i=0;i<n;i++) {
			stack.push(s.nextInt());
		}
		System.out.println(stack.pop());
		
		System.out.println(stack.size()+" "+stack.top());
		while(!stack.isEmpty()) {
			System.out.println(stack.pop());
		}
		System.out.println(stack.size());
//		stack.push(-2);
//		stack.push(0);
//		stack.push(-3);
//		System.out.println(stack.getMin());
//		stack.pop();
//		System.out.println(stack.top());
//		System.out.println(stack.getMin());
		
	}
}
