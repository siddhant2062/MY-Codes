package remove_consecutive_duplicates;
import java.util.Scanner;
public class remove_consecutive_duplicates {
	public static String take_input() {
		Scanner s=new Scanner(System.in);
		
		String str=s.nextLine();
		return str;
	}
	public static void duplicate(String s) {
		
		int size=s.length();
         int i=0;
         int j=1;
        while(i<size&&j<size) {
        	if(s.charAt(i)==s.charAt(j)) {
        		++i;
        		++j;
        	continue;       		
        	}
        	System.out.print(s.charAt(i)+" ");
        	i++;
        	j++;
        }
        System.out.print(s.charAt(j-1));
		
	}
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		
		String str=take_input();
		duplicate(str);
	}

}
