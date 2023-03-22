package Level_1;
import java.util.*;
public class _4_print_encodings {
	
		 
	   
	    static void printEncodings(String str) 
	    { 
	        int n = str.length(); 
	  
	        String encodings[] = new String[(int)Math.pow(2, n)]; 
	  
	       
	        String curr = ""; 
	  
	        
	        util(str, curr, encodings, 0); 
	    } 
	  
	    static void util(String str, String curr, String encodings[], int index) 
	    { 
	  
	        if (index == str.length()) { 
	            encodings[index] = curr; 
	            return; 
	        } 
	  
	      
	        util(str, curr + str.charAt(index), 
	                            encodings, index + 1); 
	  
	        if (index < str.length() - 1) { 
	            int val = Integer.parseInt(str.substring(index, 
	                                                index + 2)); 
	            if (val <= 26) { 
	                util(str, curr + (char)(val + 'a' - 1), 
	                                    encodings, index + 2); 
	            } 
	        } 
	    }
	    public static void main(String args[]) {
	    	String str="123";
	    	printEncodings(str);
	   
	
	
	}
}
