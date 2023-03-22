import java.util.Scanner;
public class duplicate {
	
	public static String take_input() {
		Scanner s=new Scanner(System.in);
		
		String str=s.nextLine();
		return str;
	}
	
	public static void duplicate(String a) {
		
		int size=a.length();
		for(int i=0;i<size;i++) {
			for(int j=i+1;j<size;j++) {
				if(a.charAt(i)==a.charAt(j)) {
					System.out.println(a.charAt(j));
			}
		}
	}
}
	public static void main(String args[]) {
		
		String a=take_input();
		duplicate(a);
		
	}
}
