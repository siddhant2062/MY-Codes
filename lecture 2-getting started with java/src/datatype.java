
public class datatype {
	public static void main(String args[]) {
		
		char c='a';
		System.out.println((char)(c+3));
		
		int i=c+10;
		System.out.println(i);
		
	    i=c; //we can store a character(2 bytes) into an integer(4bytes)
	    //c=i; but we can't store an integer into a character because character have less bytes than an integer 
		
		// note:- datatypes with larger bytes can store an integer with fewer bytes.
	   
	    long l=Integer.MAX_VALUE*2;
	    int a=(int)(l);
	    System.out.println(a+"''''''''''''''''''");
	    
	    l=123456565667L;
	    i=(int)l;
	    
	    System.out.println(l);
	    System.out.println(i);
	    
	    char abc=(char)i;
	    
	    
	  
 }
}
