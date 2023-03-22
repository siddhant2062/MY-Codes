package reverse_each_word;
import java.util.Scanner;
public class reverse_each_word {
	public static String take_input() {
		Scanner s=new Scanner(System.in);
		
		String str=s.nextLine();
		return str;
	}
    public static void reverse(String s) {
    	
    	int size=s.length();
    	String rev="";
    	int space=0;
    	int first=0;
    	int i=0;
    	while(i<size) {
    		if(s.charAt(i)==' ') {
    			space=i;
    			int j=space-1;
    			while(j>=first) {
    				rev=rev+s.charAt(j);
    				j--;
    			}
    			//if(s.charAt(i)==' ')
    			rev=rev+" ";
    			first=i+1;
    		}
    		i++;
    	}
    	int k=size-1;
    	while(k>=first) {
    		rev=rev+s.charAt(k);
    		k--;
    	}
    	for(int m=0;m<size;m++) {
    		System.out.print(rev.charAt(m));
    	}
    	
    }
    public static void main(String args[]) {
    	
    	String str=take_input();
    	reverse(str);
    	
    	
    	
	  
}
}
