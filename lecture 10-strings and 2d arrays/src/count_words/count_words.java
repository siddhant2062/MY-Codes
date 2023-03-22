package count_words;
import java.util.Scanner;
public class count_words {
	public static String take_input() {
		Scanner s=new Scanner(System.in);
		
		String str=s.nextLine();
		return str;
	}

	public static int count(String a) {
		
	    int count=0;
		int size=a.length();
		for(int i=0;i<size;i++) {
			if(a.charAt(i)==' ') {
			count++;
		}
		
	}
		count++;
		return count;
} 
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		
		String str=take_input();
		int a=count(str);
		System.out.println(a);
		
		
	}
		
	}
