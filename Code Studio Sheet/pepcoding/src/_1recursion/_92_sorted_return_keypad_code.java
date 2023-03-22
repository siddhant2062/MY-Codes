package _1recursion;
import java.util.*;
public class _92_sorted_return_keypad_code {
	static String codes[]= {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
	static String[] rkc(int n) {
		if(n==0) {
			String ans[]= {""};
			return ans;		
		}
		int rem=n%10;
		String small[]=rkc(n/10);
		String ans[]=new String[small.length*codes[rem].length()];
		int k=0;
//		String ch=codes[rem];
		for(int i=0;i<codes[rem].length();i++) {
			for(int j=0;j<small.length;j++) {
				ans[k]=codes[rem].charAt(i)+small[j];
				char array[]=ans[k].toCharArray();  //here converting from string to character array for sorting
				Arrays.sort(array);
				ans[k++]=new String(array);
			}
		}

		return ans;
		
	}
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		String arr[]=rkc(n);
		Arrays.sort(arr);//now sorting the whole string array
		System.out.println(Arrays.toString(arr));
	}
}
