package recursion_1;

import java.util.*;

public class rough {
	static String skip(String str,String new_str,String target,int i) {
		if(i==0) {//str.length()==0
			return new_str;
		}
		char ch=str.charAt(0);
		if(ch==target.charAt(0)) {
			return skip(str.substring(1),new_str,target,--i);
		}else {
			return skip(str.substring(1),new_str+ch,target,--i);
		}
	}
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		String new_str="";
		String ch=s.next();
//		System.out.println(str.substring(1)); if str="abcd" and substring(1) than it will return bcd
		System.out.println(skip(str,new_str,ch,str.length()));
	}
}
