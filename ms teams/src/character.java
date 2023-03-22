import java.util.Scanner;
public class character {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		
		int n=s.nextInt();
		int c=65;
		for(int i=0;i<=n;i++) {
			for (int j=0;j<=i;j++) {
				System.out.print((char)(c+j));				
			}
			System.out.println();
		}
	}

}
