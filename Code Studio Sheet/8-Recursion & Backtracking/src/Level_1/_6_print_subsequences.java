package Level_1;
import java.util.*;
public class _6_print_subsequences {
	static void print(String str,String ans) {
		if(str.length()==0) {
			System.out.println(ans);
			return;
		}
		print(str.substring(1),ans);
		print(str.substring(1),ans+str.charAt(0));
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		print(str,"");
	}
}
