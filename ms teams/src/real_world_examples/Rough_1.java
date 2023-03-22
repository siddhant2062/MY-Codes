package real_world_examples;

public class Rough_1 {
	public static void main(String args[]) {
//		char c1[]=new char[] {'a','b','c'};
//		String s1=new String(c1);
//		System.out.println(s1);
//		
//		String s2=new String("sid");
//		s2=new String("aad");
//		System.out.println(s2);
//		

		
		String str3="this is siddhant srivastava";
		
		int begin=12;
		int end=19;
		char ch[]=new char[end-begin];
		str3.getChars(begin, end, ch, 0);
		System.out.println(ch);
		

	}

}
