package pattern;
import java.util.Scanner;
public class star_pattern_12 {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		
		int i=1;
		int n=s.nextInt();
		
		while(i<=n) {
			int j=5;
			while(j>=i) {
				if(i<=j-1) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
				j=j-1;
			}
			System.out.println();
			i=i+1;
			
				}
			}
		}
		
		
	


