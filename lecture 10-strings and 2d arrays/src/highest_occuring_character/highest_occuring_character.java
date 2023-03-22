package highest_occuring_character;
import java.util.Scanner;
public class highest_occuring_character {
	public static String take_input() {
		Scanner s=new Scanner(System.in);
		
		String str=s.nextLine();
		return str;
		
	}
	public static void highest(String s) {
		
		int size=s.length();
		int count=0;
				
		char c=97;
		while(c<=122) {
			int i=0;
			int temp=0;
			int store_char=0;
			while(i<size) {				
			 if(c==s.charAt(i)) {
				temp=temp+1;
				store_char=c;
			 }
			 i++;
			}
			
			if(count<temp) {
				count=store_char;
				c++;
			}
		}
		System.out.println((char)(count));			
	}
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		
		String str=take_input();
		highest(str);
	}
}
			
				
			
			

