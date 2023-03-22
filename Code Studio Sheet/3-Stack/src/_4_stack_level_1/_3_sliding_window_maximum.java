package _4_stack_level_1;
import java.util.*;
public class _3_sliding_window_maximum {
	static int[] ngr(int arr[]) {
		int ans[]=new int[arr.length];
		Stack<Integer> stack=new Stack<>();
		for(int i=arr.length-1;i>=0;i--) {
			while(!stack.isEmpty()&&arr[i]>=arr[stack.peek()]) {
				stack.pop();
			}
			if(stack.isEmpty()) {
				ans[i]=arr.length;
			}else {
				ans[i]=stack.peek();
			}
			stack.push(i);
		}
		return ans;
	}
	static int[] window(int arr[],int k) {
		int ngr[]=ngr(arr);
		int ans[]=new int[arr.length-k+1];
		for(int i=0;i<ans.length;i++) {
			int j=i;
			while(ngr[j]<i+k) {
				j=ngr[j];
			}
			ans[i]=arr[j];
		}
		return ans;
	}
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		int arr[]=new int[s.nextInt()];
		for(int i=0;i<arr.length;i++) {
			arr[i]=s.nextInt();
		}
		int k=s.nextInt();
		System.out.println(Arrays.toString(window(arr,k)));
	}
}
