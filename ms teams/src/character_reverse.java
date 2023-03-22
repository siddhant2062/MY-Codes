import java.util.Scanner;
public class character_reverse {
	
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		
		int n=s.nextInt();
		int c=65;
		
		for(int i=0;i<=n;i++) {
			int var=0;
			for (int j=n;j>=i;j--) {
				System.out.print((char)(c+var));
				var=var+1;
			}
			System.out.println();
		}
	}

}

	