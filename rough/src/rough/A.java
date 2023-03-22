package rough;

public class A
{
	public static void main(String args[]){  
		int value=30;  
		boolean value1=true;
		char value2=100;
//		System.out.println((char)('b'+1));
		
		String s1=String.valueOf(value2);  
		System.out.println(s1+100);//concatenating string with 100 
		
		
		String str="my name is siddhant";
		System.out.println(str.contains("name "));
		System.out.println(str.startsWith("my "));
		System.out.println(str.endsWith("is siddhannt"));
		
		
		String s2="ABCDEFG";  
		byte[] barr=s2.getBytes();  
		for(int i=0;i<barr.length;i++){  
		System.out.println(barr[i]);  
		}  
		  
		}
}
