package pattern;
import java.util.Scanner;
public class star_pattern_18 {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		
		int i=1;
		int n=s.nextInt();
		
		while(i<=n) {
			int j=1;
			while(j<=5) {
				if(i>1&&i<5&&j>1&&j<5) {
					System.out.print(" ");					
				}else {									
				System.out.print("*");
				}
				j=j+1;
			}
			System.out.println();
			i=i+1;
			
			}
			
		}
}