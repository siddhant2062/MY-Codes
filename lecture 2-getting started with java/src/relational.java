import java.util.Scanner;
public class relational {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		int i=s.nextInt();
		int j=s.nextInt();
		
		boolean a=i==j;
		boolean b=i>=j;
		boolean c=i<=j;
		boolean d=i<j;
		boolean e=i>j;
		boolean f=i!=j;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println("is greator"+e);
		System.out.println(f);
		
	}

}
