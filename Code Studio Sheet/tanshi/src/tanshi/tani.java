package tanshi;
import java.util.*;
public class tani {
	static boolean isValid(String str) {
        Stack<Character> stack=new Stack<>();
        char ch=str.charAt(0);
//        if(ch==')'||ch==']'||ch=='}'){
//            return false;
//        }
        for(int i=0;i<str.length();i++){
            char a=str.charAt(i);
            if(a=='('||a=='['||a=='{'){
                stack.push(a);
            }else{
            	if(stack.isEmpty()) {
            		return false;
            	}
                if(stack.peek()=='('&&a==')'){
                    stack.pop();
                }else if(stack.peek()=='['&&a==']'){
                    stack.pop();
                }else if(stack.peek()=='{'&&a=='}'){
                    stack.pop();
                }else{
                stack.push(a);
                }
            }
        }
        return stack.isEmpty();
    }
	public static void main(String rags[]) {
    	Scanner s=new Scanner(System.in);
    	String str=s.next();
    	System.out.println(isValid(str));
    }
}
