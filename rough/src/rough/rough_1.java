package rough;
import java.util.ArrayList;
import java.util.Scanner;
public class rough_1 {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		int p=s.nextInt();
		int count=0;
		int n=0;
		while(count<p) {
			int ele=5*n+3;
			if(ele%7==0) {
				n++;
				continue;
			}else {
				count++;
				n++;
				System.out.println(ele);
			}
		}
	}

}
