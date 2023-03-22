package contest_1;
import java.util.*;
public class i_count_words {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
//		int size=s.nextInt();
//		int arr[]=new int[size];
		int value=s.nextInt();
		int target=s.nextInt();
		int count=0;
		while(value!=0) {
			int rem=value%10;
			if(rem==target) {
				count++;
			}
			value=value/10;
			
		}
		System.out.println(count);
	}

}
