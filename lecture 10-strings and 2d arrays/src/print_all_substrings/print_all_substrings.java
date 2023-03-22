package print_all_substrings;
import java.util.Scanner;
public class print_all_substrings {
	public static String take_input() {
		Scanner s=new Scanner(System.in);
		
		String str=s.nextLine();
		return str;
		
	}
	public static void substring(String str) {
		
		int size=str.length();
		int start=0;
		for(int i=0;i<size;i++) {
			for(int end=i+1;end<=size;end++) {
				
				String a=str.substring(start,end);
				System.out.println(a);
			}
			start=start+1;
		}
	}
	public static void main(String args[]) {
		
		String a=take_input();
		substring(a);
	}

}

