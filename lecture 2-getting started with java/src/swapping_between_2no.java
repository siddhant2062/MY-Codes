import java.util.Scanner;
public class swapping_between_2no {
	public static void main(String atrgs[]) {
		Scanner s=new Scanner(System.in);
		
		int a=20;
		int b=10;
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println(a);
		System.out.println(b);
	}

}
