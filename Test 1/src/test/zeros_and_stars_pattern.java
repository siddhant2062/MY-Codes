package test;
import java.util.Scanner;
public class zeros_and_stars_pattern {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		
		int i=1;
		int n=s.nextInt();
		int a=1;
		int b=n;
		while(i<=n) {			
			int j=1;
			
			while(j<=n) {
				
				if(j==a) {
				System.out.print("*");				
				}
				if(j!=a) {
				System.out.print("0");				
				}
				j=j+1;
			}
			int k=1;
			while(k<=1) {
				System.out.print("*");
				k++;
			}
			int l=1;
			while(l<=n) {
				if(l==b) {
					System.out.print("*");
				}
				if(l!=b) {
					System.out.print("0");
				}
				l=l+1;
			}
			
			System.out.println();
			i=i+1;
			a=a+1;
			b=b-1;
		}
		
	}

}
