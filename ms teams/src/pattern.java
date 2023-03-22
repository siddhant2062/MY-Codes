import java.util.Scanner;

public class pattern {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);

		int n = s.nextInt();
		for (int i = 0; i <= n; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print((char) (65 + j));
			}
			int var = 1;
			for (int k = n - i; k >= 1; k--) {
				System.out.print(var);
				var = var + 1;

			}
			System.out.println();
		}
	}

}
