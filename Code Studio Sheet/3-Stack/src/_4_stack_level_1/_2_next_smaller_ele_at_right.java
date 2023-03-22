package _4_stack_level_1;

import java.util.*;
	
public class _2_next_smaller_ele_at_right {
static int[] ngr(int arr[]) {
	int ans[]=new int[arr.length];
	Stack<Integer> stack=new Stack<>();
	for(int i=arr.length-1;i>=0;i--) {
		while(!stack.isEmpty()&&arr[i]<=stack.peek()) {
			stack.pop();
		}
		if(stack.isEmpty()) {
			ans[i]=-1;
		}else {
			ans[i]=stack.peek();
		}
		stack.push(arr[i]);
	}
	return ans;
	}
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		int arr[]=new int[s.nextInt()];
		for(int i=0;i<arr.length;i++) {
			arr[i]=s.nextInt();
		}
		System.out.println(Arrays.toString(ngr(arr)));
	}
}
