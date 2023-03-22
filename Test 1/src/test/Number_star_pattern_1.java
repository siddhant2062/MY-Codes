package test;
import java.util.Scanner;
public class Number_star_pattern_1 {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		
		int i=1;
		int n=s.nextInt();
		int a=1;
		while(i<=n) {			
			int j=n;
			
			while(j<=n&&j>0) {
				
				if(j==a) {
				System.out.print("*");				
				}
				if(j!=a) {
				System.out.print(j);				
				}
				j=j-1;
			}
			System.out.println();
			i=i+1;
			a=a+1;
		}
	}

}
