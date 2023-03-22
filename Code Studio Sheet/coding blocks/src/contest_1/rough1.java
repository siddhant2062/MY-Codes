package contest_1;
import java.util.*;
public class rough1 {
	public static int change(String str) {
	    int sum=0;
	    for(int i=0;i<str.length();i++){
	        sum*=26;
	       int mod = str.charAt(i) - 'A'+1;
	        sum+=mod;
	    }
	    return sum;
	}
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		System.out.println(change(str));
	}

}
