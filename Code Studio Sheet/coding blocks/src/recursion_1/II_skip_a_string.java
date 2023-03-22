package recursion_1;
import java.util.*;
public class II_skip_a_string {
	static String skipString(String str,String new_str,String target) {
		if(str.length()==0) {
			return new_str;
		}
		if(startswith(str,target)) {
			return skipString(str.substring(target.length()),new_str,target);
		}else {
			return skipString(str.substring(1),new_str+str.charAt(0),target);
		}
	}
	static boolean startswith(String str,String target) {
		if(target.length()==0) {
			return true;
		}else if(str.length()==0) {
			return false;
		}
		
		if(str.charAt(0)==target.charAt(0)) {
			return startswith(str.substring(1),target.substring(1));
		}else {
			return false;
		}
	}
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		String new_str="";
		String target=s.next();
		System.out.println(skipString(str,new_str,target));
	}

}
