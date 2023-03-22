package _1_stack_using_array;
import java.util.*;
public class rogh {
	static String codes[]={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
	public static List<String> letterCombinations(String digits) {
        if(digits.isEmpty()){
            List<String> ans=new ArrayList<String>();
            return ans;
        }else{
            String str="";
            List<String> out=new ArrayList<>();
            lettercombinations(digits,str,out,0);
            return out;
        }
        
    }
    static void lettercombinations(String digits,String str,List<String> ans,int count){
        if(digits.length()==0){
            ans.add(str);
            count++;
            System.out.println(ans);
            return;
            
        }
        int ch=digits.charAt(0)-'0';
        for(int i=0;i<codes[ch].length();i++){
            lettercombinations(digits.substring(1),str+codes[ch].charAt(i),ans,count);
//            System.out.println(count);
        }
        
        }
       
    
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
//		long n=s.nextInt();
//		System.out.println(count(n));
//		String[] arr= {"abs","def"};
		String digits=s.next();
		System.out.println(letterCombinations(digits));
	}
}

