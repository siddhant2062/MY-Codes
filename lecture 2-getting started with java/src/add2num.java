import java.util.Scanner;
public class add2num {
	private static Scanner scan;

	public static void main(String args[]) {
		scan = new Scanner(System.in);
		
        int i=scan.nextInt();
        int j=scan.nextInt();
		int k=i+j;
		System.out.println(k);
		i=15;
		k=i+j;
		System.out.println(k);
		
       

	}

}
