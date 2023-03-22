package bitwise;
import java.util.*;
public class reverse_integer {
	static int reverse(int x) {
	if(x>Integer.MAX_VALUE){
        return 0;
    }
    int n=x;
    int rev=0;
    while(x!=0){
        int rem=x%10;
        rev=rev*10+rem;
        x/=10;
    }
     
     return rev;
//    return x-rev;
	}
    public static void main(String args[]) {
    	Scanner s=new Scanner(System.in);
    	int n=s.nextInt();
    	System.out.println(reverse(n));
//    	System.out.println(-23%10);
}
}
