import java.util.*;
public class pattern {
	public static void pattern1(int n) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void pattern2(int n) {
		for(int i=0;i<n;i++) {
			for(int j=i;j<n;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void pattern3(int n) {
		for(int i=1;i<2*n;i++) {
			int col=i<=n ?i:2*n-i;						
			for(int j=i;j<=col;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter any number");
		int choice=s.nextInt();
		switch(choice) {
		case 1:
			System.out.println("take input");
			int n=s.nextInt();
			pattern1(n);
			break;
		
		case 2:
			System.out.println("take input");
			int n1=s.nextInt();
			pattern2(n1);
			break;
		case 3:
			System.out.println("take input");
			int n2=s.nextInt();
			pattern3(n2);
			break;
		
		default:
			System.out.println("Invalid Choice");
	}

  }
}
