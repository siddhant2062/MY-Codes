// we have to skip app not apple input:- bacappledh out:-bacappledh input1:-bacappldh out1:-bacldh here it skipped app 
package recursion_1;
import java.util.*;
public class III_skip_the_string_if_not_the_required_string {
	static String skipStringNotMarked(String str,String new_str,String target,String marked_str) {
		if(str.length()==0) {
			return new_str;
		}
		if(startswith(str,target)&&!startswith(str,marked_str)) {
			return skipStringNotMarked(str.substring(target.length()),new_str,target,marked_str);
		}else {
			return skipStringNotMarked(str.substring(1),new_str+str.charAt(0),target,marked_str);
		}
	}
	static boolean startswith(String str,String target) {
		if(target.length()==0) {
			return true;
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
		String marked_str=s.next();//here marked string means that if this string is present than it shouldn't be deleted
		System.out.println(skipStringNotMarked(str,new_str,target,marked_str));
	}
}
/*
  input:-bacappledh 
	     app
         apple
  output:-bacappledh 
  
  input1:-bacappldh 
	     app
         apple
  output1:-bacldh 
*/
