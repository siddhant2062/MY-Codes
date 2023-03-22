package _1recursion;
import java.util.*;
public class _98_return_subsequences_alternate {

//	static ArrayList<String> list=new ArrayList<>();
	static String[] ss(String str,String newstr) {
		if(str.length()==0) {
			String ans[]= {newstr};
			return ans;
		}
		String nottake[]=ss(str.substring(1),newstr);		
		String take[]=ss(str.substring(1),newstr+str.charAt(0));
		String ans[]=new String[2*take.length];
		int k=0;
		for(int i=0;i<nottake.length;i++) {
			ans[k++]=nottake[i];
		}
		for(int i=0;i<take.length;i++) {
			ans[k++]=take[i];
		}
		return ans;
		
	}
	static String[] ss(String str) {
		String newstr="";
		return ss(str,newstr);
		
	}
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		String str=s.next();
		System.out.println(Arrays.toString(ss(str)));
	}

}