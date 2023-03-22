package _1_stack_using_array;
import java.util.*;
public class rough_1 {
	static int neg=0;
	static int lwbs=0;
    public static int myAtoi(String s) {
      
        if(s.length()==1){
            char check=s.charAt(0);
            if(check>='0'&&check<='9'){
            return s.charAt(0)-'0';
            }else if(check=='-'){
            	neg++;
            	return 0;
            }else if(check>='a'&&check<='z'||check>='A'&&check<='Z'){
            	lwbs++;
                return 0;
            }else {
            	return 0;
            }
        }
        int small=myAtoi(s.substring(0,s.length()-1));
        if(small==Integer.MAX_VALUE){
        	System.out.println(Integer.MAX_VALUE);
            return Integer.MAX_VALUE;
        }else if(small==Integer.MIN_VALUE){
            return Integer.MIN_VALUE;
     }
        char check=s.charAt(s.length()-1);
        if(small>0||small<0){
        	
            if(check>='a'&&check<='z'||check>='A'&&check<='Z'||check==' '||check=='.'){
            	lwbs++;
                return small;
            }
        }
        if(lwbs>0||check==' ') {
        	return small;
        }
        
        if(check=='-'){
            neg++;
            return small;
        }
        
        int last_digit=s.charAt(s.length()-1)-'0';
        if(neg>0){
        	long out=((long)(Math.abs(small))*10+last_digit)*-1;
//        	System.out.println(out);
        	if(out<Integer.MIN_VALUE) {
        		out=Integer.MIN_VALUE;
        	}
        return (int)out;
        }else{
        	long out=(long)(small)*10+last_digit;
//        	System.out.println(out);
        	if(out>Integer.MAX_VALUE) {
        		out=Integer.MAX_VALUE;
        	}
        return (int)out;
        }

    }
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
//		System.out.println(myAtoi(str));
		System.out.println(100%4);
		int mod=1000000007;
		
	}

}
