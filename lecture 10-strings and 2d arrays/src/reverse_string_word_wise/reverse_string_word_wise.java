package reverse_string_word_wise;
import java.util.Scanner;
public class reverse_string_word_wise {
	public static String take_input() {
		Scanner s=new Scanner(System.in);
		
		String str=s.nextLine();
		return str;
	}
	public static void reverse(String str) {
		int size=str.length();
		//int i=size-1;
		int start=size-1;
		int end =size;
		String result="";
		while(start>=0) {
//	String a=str.substring(start,end+1);
//	System.out.print(a);
			if(str.charAt(start)==' ') {
				result=result+str.substring(start+1,end)+" ";
				end=start;
			}
		start--;
		}
		result=result+str.substring(start+1,end);
		System.out.println(result);
	}
	public static void main(String args[]) {
		
		String a=take_input();
		reverse(a);
	}

}
