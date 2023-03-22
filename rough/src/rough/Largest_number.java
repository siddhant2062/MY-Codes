package rough;
import java.util.*;
public class Largest_number {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		int size=s.nextInt();
		String str="";
		int arr[]=new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=s.nextInt();
			str=str+Integer.toString(arr[i]);
		}
//		System.out.println(str);
		int temp=Integer.MIN_VALUE;
		for(int i=0;i<str.length();i++) {
			for(int j=i+1;j<str.length()-1;j++) {
				if((int)(str.charAt(i))>=(int)(str.charAt(j))) {
					temp=str.charAt(i)-0;
				}
			}
			System.out.print(temp);
		}
//		System.out.println(str.charAt(0));
	}

}
