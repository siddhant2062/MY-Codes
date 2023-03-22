package rough;
import java.util.Scanner;
public class rough3 {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		if(a%2==0) {
			System.out.println(a+"is even no"+"\n"+ a++ +"is now odd no");
			
		}
		else {
			System.out.println(a+"is odd no"+"\n"+ a-- +"is now even no");
		}
	}

}
