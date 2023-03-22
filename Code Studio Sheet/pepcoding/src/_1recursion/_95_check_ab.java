package _1recursion;
import java.util.*;
public class _95_check_ab {
	static boolean checkab(String str) {
		if(str.length()==0) {
			return true;
		}
		if(str.charAt(0)=='a') {
			if(str.substring(1).length()>1&&str.substring(1,3).equals("bb")) {
				return checkab(str.substring(3));
			}else {
				return checkab(str.substring(1));
			}
		}
		return false;
	}
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		String str=s.next();
//		String a=str.substring(0,1);
		boolean check=checkab(str);
		System.out.println(check);
	}
}
