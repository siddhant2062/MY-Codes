package Level_1;
import java.util.*;
public class _2_get_keypad_codes {
	static String codes[]= {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
	static ArrayList<String> getkc(String digits,int index,String curr){
		if(index==digits.length()) {
			ArrayList<String> ans=new ArrayList<>();
			ans.add(curr);
			return ans;
		}
		int ch=digits.charAt(index)-'0';
		ArrayList<String> ans=new ArrayList<>();
		
		for(int i=0;i<codes[ch].length();i++) {
			ans.addAll(getkc(digits,index+1,curr+codes[ch].charAt(i)));
		}
		return ans;
	}

	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		String digits=sc.next();
		System.out.println(getkc(digits,0,""));
	}
}
