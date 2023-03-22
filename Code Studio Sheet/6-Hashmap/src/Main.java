import java.util.*;
public class Main {
	static int[] nsl(int arr[]){
        Stack<Integer> stack=new Stack<>();
        int ans[]=new int[arr.length];
        int maxi=-1;
        for(int i=0;i<arr.length;i++){
            while(!stack.isEmpty()&&arr[i]>=stack.peek()){
                stack.pop();
            }
           
            if(stack.isEmpty()){
                ans[i]=-1;
            }else{
                ans[i]=maxi;
            }
            stack.push(arr[i]);
            if(maxi<=stack.peek()){
                maxi=stack.peek();
            }
        }
        return ans;
    }
	static int[] nsr(int arr[]) {
		Stack<Integer> stack=new Stack<>();
	    int ans[]=new int[arr.length];
	    int maxi=-1;
	    for(int i=arr.length-1;i>=0;i--) {
	    	while(!stack.isEmpty()&&arr[i]>=stack.peek()) {
	    		stack.pop();
	    	}
	    	if(stack.isEmpty()) {
	    		ans[i]=-1;
	    	}else {
	    		ans[i]=maxi;
	    		
	    	}
	    	stack.push(arr[i]);
	    	if(maxi<=stack.peek()) {
	    		maxi=stack.peek();
	    	}
	    }
	    return ans;
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[sc.nextInt()];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int nosl[]=nsl(arr);
		int nosr[]=nsr(arr);
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			if(nosl[i]>=0&&nosr[i]>=0) {
				sum+=Math.min(nosl[i],nosr[i])-arr[i];
			}
		}
		System.out.println(sum);
	}
}
