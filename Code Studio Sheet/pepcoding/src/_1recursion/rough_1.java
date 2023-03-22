package _1recursion;
import java.util.*;
public class rough_1 {
	static String[] getss(String str) {
		if(str.length()==0) {
			String ans[]= {""};
			return ans;
		}
		String small[]=getss(str.substring(1));
		String ans[]=new String[2*small.length];
		int k=0;
		for(int i=0;i<small.length;i++) {
			ans[k++]=small[i];			
		}
		for(int i=0;i<small.length;i++) {
			ans[k++]=str.charAt(0)+small[i];
		}
		return ans;
		
	}
public static void main(String args[]) {
	Scanner s=new Scanner(System.in);
	String str=s.next();
	String a[]=getss(str);
	System.out.println(Arrays.toString(a));
//	int ak=123;
//	String sc=Integer.toString(ak);
//	int abc=Integer.parseInt("1");
	
	
	
	
	
	
	
}
}
