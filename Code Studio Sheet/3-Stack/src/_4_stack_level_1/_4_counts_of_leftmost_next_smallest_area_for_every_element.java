package _4_stack_level_1;
import java.util.*;
public class _4_counts_of_leftmost_next_smallest_area_for_every_element {
	static int[] count(int arr[]) {
		int ans[]=new int[arr.length];
		Stack<Integer> stack=new Stack<>();
		for(int i=0;i<arr.length;i++) {
			while(!stack.isEmpty()&&arr[i]<=arr[stack.peek()]) {
				stack.pop();
			}
			if(stack.isEmpty()) {
				ans[i]=i+1;
			}else{
				ans[i]=i-stack.peek();
			}
			stack.push(i);
		}
		return ans;
	}
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		int arr[]=new int[s.nextInt()];
		for(int i=0;i<arr.length;i++) {
			arr[i]=s.nextInt();
		}
		System.out.println(Arrays.toString(count(arr)));
		
	}
}