import java.util.Scanner;
public class fahtocel{

	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		int f=s.nextInt();
		int cel=(int)(5.0/9*(f-32)); // its an example of expilicit typecasting
		System.out.println(cel);
		double cel_1=5.0/9*(f-32);
		System.out.println(cel_1);

	}
	
}