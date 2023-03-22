package _1recursion;
import java.util.Scanner;
public class _1_pre_in_post {
	static void fn(int n) {
		if(n==0) {
			return;
		}
		System.out.println("pre"+" =\t"+n);
		fn(n-1);
		System.out.println("in"+" =\t"+n);
		fn(n-1);
		System.out.println("post"+" =\t"+n);
	}
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		fn(n);
	}
}
