import java.util.Scanner;
public class logical {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		int i=s.nextInt();
		int j=s.nextInt();
		int k=s.nextInt();
		
		boolean a=(i>=j)&&(j>=k);
		boolean b=(i<=j)||(j<=k);
		boolean c=(i<=j)||(j==k);
		boolean d=!(i<=j);
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
	}
	

}
