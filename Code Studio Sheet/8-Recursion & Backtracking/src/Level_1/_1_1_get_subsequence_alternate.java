package Level_1;
import java.util.*;
public class _1_1_get_subsequence_alternate {
	static ArrayList<String> getss(String str){
		if(str.length()==0) {
			ArrayList<String> ans=new ArrayList<>();
			ans.add("");
			return ans;
		}
		ArrayList<String> gss=getss(str.substring(1));
		
		ArrayList<String> ans=new ArrayList<>();
		for(int i=0;i<gss.size();i++) {
			ans.add(gss.get(i));
			ans.add(str.charAt(0)+gss.get(i));
		}
	
		return ans;
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		System.out.println(getss(str));
	}
}
