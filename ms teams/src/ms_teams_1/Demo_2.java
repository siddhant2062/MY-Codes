package ms_teams_1;

public class Demo_2 {
	public static void main(String args[]) {
		StringBuffer s1=new StringBuffer("hello sid"); 
		
		System.out.println(s1.length()+" "+s1.capacity());
		s1.append("hey hi");
		System.out.println(s1.length()+" "+s1.capacity());
		s1.append("hey hey hey hey");//now here length of the string exceeds the capacity so jvm will increase the capacity using an algorithm i.e.,[(old_capacity*2)+2] .....here old capacity is 25 so it make it 52 using the algo.
		System.out.println(s1.length()+" "+s1.capacity());
		s1.append("hey hey hey hey hey hey hey hey hey");//here old capacity is 52 so it make it 106 using the algo.
		System.out.println(s1.length()+" "+s1.capacity());
		
		
		
		

	}

}
