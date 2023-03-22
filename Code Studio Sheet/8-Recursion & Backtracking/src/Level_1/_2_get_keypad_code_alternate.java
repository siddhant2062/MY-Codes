package Level_1;
import java.util.*;
public class _2_get_keypad_code_alternate {
	static String codes[]= {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
	static ArrayList<String> getkc(String digits){
		if(digits.length()==0) {
			ArrayList<String> ans=new ArrayList<>();
			ans.add("");
			return ans;
		}
		int ch=digits.charAt(0)-'0';
		ArrayList<String> ans=new ArrayList<>();
		for(int i=0;i<codes[ch].length();i++) {
			ArrayList<String> out=getkc(digits.substring(1));
			for (int j = 0; j < out.size(); j++) {
	            ans.add(codes[ch].charAt(i) + out.get(j));
	        }
			
		}
		return ans;
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		System.out.println(getkc(str));
	}
}
