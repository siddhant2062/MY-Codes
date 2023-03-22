import java.util.Scanner;
public class pattern_reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		
		int n=s.nextInt();
		int var=5;
		for (int i=1;i<=n;i++) {
			for (int j=n;j>=i;j--) {
				System.out.print(var);
				
			}
			System.out.println();
			var=var-1;
		}

	}

}
