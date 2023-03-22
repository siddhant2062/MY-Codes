package _4_stack_level_1;
import java.util.*;
public class _5_counts_of_rightmost_next_smallest_area_for_every_element {
	static int[] count(int arr[]) {
		int ans[]=new int[arr.length];
		Stack<Integer> stack=new Stack<>();
		int count=0;
		for(int i=arr.length-1;i>=0;i--) {
			while(!stack.isEmpty()&&arr[i]<=arr[stack.peek()]) {
				stack.pop();
			}
			if(stack.isEmpty()) {
				
				ans[i]=count+1;
			}else{
				ans[i]=stack.peek()-i;
			}
			count++;
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
