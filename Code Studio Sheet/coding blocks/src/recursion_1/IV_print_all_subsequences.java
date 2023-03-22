package recursion_1;
import java.util.Scanner;
public class IV_print_all_subsequences {
	static void subsequence(String str,String new_str) {
		if(str.length()==0) {
			System.out.println(new_str);
			return;
		}
		subsequence(str.substring(1),new_str);
		subsequence(str.substring(1),new_str+str.charAt(0));
		
//		subsequence(str.substring(1),new_str+(str.charAt(0)+0));// all subsequence with ascii
		
	}
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		String str=s.next();
		String new_str="";
		subsequence(str,new_str);
	}

}
