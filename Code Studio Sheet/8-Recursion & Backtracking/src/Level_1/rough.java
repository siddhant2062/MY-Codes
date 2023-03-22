package Level_1;
import java.util.*;
public class rough {
	static String codes[]= {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
	static ArrayList<String> find(String str){
		if(str.length()==0) {
			ArrayList<String> ans=new ArrayList<>();
			ans.add("");
			return ans;
		}
		int ch=str.charAt(0)-'0';
		ArrayList<String> ans=new ArrayList<>();
		for(int i=0;i<codes[ch].length();i++) {
			ArrayList<String> out=find(str.substring(1));
			for(int j=0;j<out.size();j++) {
				ans.add(codes[ch].charAt(i)+out.get(j));
			}
		}
		return ans;
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		System.out.println(find(str));
	}
}
