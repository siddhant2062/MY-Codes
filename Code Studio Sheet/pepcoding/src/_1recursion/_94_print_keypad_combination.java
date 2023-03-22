package _1recursion;
import java.util.*;
public class _94_print_keypad_combination {
	static String codes[]= {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
	static void print(int n,String str,ArrayList<String> ans) {
		if(n==0) {
//			System.out.println(str);
			ans.add(str);
			
			return;
		}
		int rem=n%10;
		for(int i=0;i<codes[rem].length();i++) {
			print(n/10,codes[rem].charAt(i)+str,ans);
		}
	}
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
//		int n=s.nextInt();
//		String str="";
//		ArrayList<String> ans=new ArrayList<>();
//		print(n,str,ans);
//		System.out.println(ans);
		ArrayList<Character> ans=new ArrayList<>();
		ans.add('a');
		ans.add('b');
		
	}
	
}
