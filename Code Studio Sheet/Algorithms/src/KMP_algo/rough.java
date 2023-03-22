package KMP_algo;
import java.util.*;
public class rough {
	static void print(String str,String ans) {
		if(str.length()==0) {
			System.out.println(ans);
			return;
		}
		for(int i=0;i<str.length();i++) {
			String ls=str.substring(0,i);
			String rs=str.substring(i+1);
			String out=ls+rs;
			char ch=str.charAt(i);
			print(out,ans+ch);
					
		}
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		print(str,"");
	}
}
