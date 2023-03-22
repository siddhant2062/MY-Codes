package print_prefix;
import java.util.Scanner;
public class print_prefix {
	public static String take_input() {
		Scanner s=new Scanner(System.in);
		
		String str=s.nextLine();
		return str;
	}
	public static void prefix(String str) {
		
		int size=str.length();
		for(int i=0;i<size;i++) {
			System.out.println(str.substring(0,i+1));
		}
	}
	public static void main(String args[]) {
		
		String a=take_input();
		prefix(a);
	}

}
