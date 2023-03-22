package _1recursion;
import java.util.*;
public class _9_return_subsequences {
	static String[] sub(String str) {
		if(str.length()==0) {
			String ans[]= {""};
			return ans;
		}
		String small[]=sub(str.substring(1));
		String ans[]=new String[2*small.length];
		int k=0;
		for(int i=0;i<small.length;i++) {
			ans[k]=small[i];
			k++;
		}
		for(int i=0;i<small.length;i++) {
			ans[k]=str.charAt(0)+small[i];
			k++;
		}
		return ans;
	}
public static void main(String args[]) {
	Scanner s=new Scanner(System.in);
	String str=s.next();
	String out[]=sub(str);
	System.out.println(Arrays.toString(out));
//	String abc[]= {"","abc","defg"};
//	System.out.println(abc[1].length());
}
}
