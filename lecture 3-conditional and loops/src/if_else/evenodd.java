package if_else;
import java.util.Scanner;
public class evenodd {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		
		int n=s.nextInt();
		int a=n%2;
		if(a==0) {
			System.out.println("even");
		return;
		}
		System.out.println("odd");
		}
	}


// alternative method
//import java.util.Scanner;
// public class evenodd {
//	public static void main(String args[]) {
//		Scanner s=new Scanner(System.in);
//		
//		int n=s.nextInt();
//		
//		if(n%2==0) {
//			System.out.println("even");
//			} else {
//		
//		     System.out.println("odd");
//		}
//	}
//}

