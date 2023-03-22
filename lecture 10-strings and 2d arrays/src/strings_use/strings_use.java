package strings_use;

public class strings_use {
	public static void main(String args[]) {
        char a='c';
		String b="abcdefgh";
		System.out.println(b.charAt(4));
		System.out.println(b.length());
	    System.out.println(b.substring(3,6));//here 3 is termed as start index of the substring and 6 is considered as (last-1) index of the substring.so if we print substring than it will print start to (last-1) index.
	    System.out.println(b.substring(2));// here 2 is termed as start index of the substring. So if we print substring than it will print start index to last index.
	    System.out.println(b);
	    System.out.println(b.contains("bcde"));//true because part of string
	    System.out.println(b.contains("bdf"));  //false because not part of string 
	    
	    String str="abcd";
	    String str1="abcd";
	    String str2="abcde";		
	    if(str.contentEquals(str1)) {      //note:- when we compare two arrays or two strings(string and arrays are non primitive datatypes) than it don't compare the data inside the array, actually it compares their addresses, so we use .equals() or.contentEquals() which compares address. 
	    	System.out.println("str1 is equal");
	    }else if(str.contentEquals(str2)) {
	    		System.out.println("str2 is equal");
	    	}else {
	    		System.out.println("unequal");
	    }
		 /* String str1="abcde";
		    String str2="abcde";
		    int a[]= {1,2};
		    int b[]= {1,2};
		    int i=2;
		    if(str1==str2) {
		    	System.out.println("equal");
		    }else {
		    	System.out.println("not equal");
		    }
		    if(a==b) {
		    	System.out.println("equal");
		    }else {
		    	System.out.println("not equal");
		    }*/
		
	}
	

}
