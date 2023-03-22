package _4_stack_level_1;
import java.util.*;
public class remove_k_digits {

	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		int k=s.nextInt();
		String str=s.next();
		System.out.println(removeKdigits(str,k));
	}
	public static String removeKdigits(String num, int k) {
        Stack<Character> stack=new Stack<>();
        String str="";
        for(int i=0;i<num.length();i++){
            while(!stack.isEmpty()&&k>0&&num.charAt(i)<stack.peek()){
                stack.pop();
                k--;
            }
            stack.push(num.charAt(i));
            
        }
        while(k>0&&stack.size()>0){
            stack.pop();
            k--;
        }
        char ans[]=new char[stack.size()];

        for(int i=stack.size()-1;i>=0;i--){
            ans[i]=stack.pop();
            
        }
//        System.out.println(ans);
        
        int count=0;
        for(int i=0;i<ans.length;i++){
            if(ans[i]>='1'&&ans[i]<='9'){
                count++;
            }
            if(count==0){
                continue;
            }else{
                str+=ans[i];
            }
        }
        
         if(str.length()==0){
             str="0";
         }
        return str;
    }
}
