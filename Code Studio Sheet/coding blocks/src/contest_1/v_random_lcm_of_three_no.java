//approach:-first of all find the max of three numbers and compare it with all the three no that it is divisible by that number or not if yes than that's the answer if no than increment by the number which was the max of all three numbers and check all the possibilities till the product of three numbers 
package contest_1;
import java.util.*;
public class v_random_lcm_of_three_no {
public static void main(String args[]) {
	Scanner s=new Scanner(System.in);
	int n1=s.nextInt();
	int n2=s.nextInt();
	int n3=s.nextInt();
	int temp=Math.max(n1,n2);
	int high=Math.max(temp, n3);
	int product=n1*n2*n3;
	for(int i=high;i<=product;i=i+high) {
		if(i%n1==0&&i%n2==0&&i%n3==0) {
			System.out.println(i);
			break;
		}
	}
	
}
}
