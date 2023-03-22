package Level_1;
import java.util.*;
//for n length a substring is n(n+1)/2 and for subsequences 2^n because every character has two choices
public class _1_get_subsequence {
	static ArrayList<String> ss(String str){
		if(str.length()==0) {
			ArrayList<String> ans=new ArrayList<>();
			ans.add("");
			return ans;
		}
		ArrayList<String> nottake=ss(str.substring(1));
		ArrayList<String> take=ss(str.substring(1));
		ArrayList<String> ans=new ArrayList<>();
		for(int i=0;i<nottake.size();i++) {
			ans.add(nottake.get(i));
		}
		for(int i=0;i<take.size();i++) {
			ans.add(str.charAt(0)+take.get(i));
		}
		return ans;
 	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		System.out.println(ss(str));
	}
}
