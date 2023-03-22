package _1recursion;
import java.util.*;
public class _93_print_subsequences {
	static void sub(String str,String new_str) {
		if(str.length()==0) {
			System.out.println(new_str);
			return;
		}
		sub(str.substring(1),new_str);
		sub(str.substring(1),new_str+str.charAt(0));
	}
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		String str=s.next();
		String new_str="";
		sub(str,new_str);
	}
}
