package _3_stack_inbuilt;
import java.util.*;
public class Stack_in_Collections {
	public static boolean checkRedundantBrackets(String str) {
		Stack <Character> stack =new Stack<>();
		Stack <Integer> stack1=new Stack<>();
		if(str.charAt(0)==')'||str.charAt(0)==']'||str.charAt(0)=='}'){
			return false;
		}
		int count=0;
		for(int i=0;i<str.length();i++){
			char a=str.charAt(i);
			if(a=='('||a=='{'||a=='['){
				stack.push(a);
			}else if(a!=')'||a!=']'||a!='}'){

				stack.push(a);
			} else{
				char temp=a;
				stack.push(a);
				while(stack.peek()!='('){
					stack.pop();
					count++;
				}
				if(count<=1) {
					return true;
				}
				if(stack.peek()=='('&&temp==')'){
					stack.pop();
				}else if(stack.peek()=='{'&&temp=='}'){
					stack.pop();
				}else if(stack.peek()=='['&&temp==']'){
					stack.pop();
				}
				count=0;
			}
			
			
		}
		return stack.isEmpty();
	}
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
//		Stack<Integer> stack=new Stack<>();
		String str=s.nextLine();
//		int arr[]= {10,20,30,40};
//		for(int i=0;i<arr.length;i++) {
//			stack.push(arr[i]);
//		}
//		while(!stack.isEmpty()) {
//			System.out.println(stack.peek());
//			stack.pop();
//		}
		System.out.println(checkRedundantBrackets(str));
	}
}
//pehle check kro saare brackets valid hai aur hai to fir check kro
