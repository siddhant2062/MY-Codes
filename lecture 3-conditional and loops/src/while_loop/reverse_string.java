package while_loop;
import java.util.Scanner;
public class reverse_string {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		
	String str=s.next();
	int a=str.length();	
	String rev="";
	int i=a-1;
	
	
	while(i>=0) {
		rev=rev+str.charAt(i);
		i=i-1;
	}
	System.out.println(rev);
	}

}


