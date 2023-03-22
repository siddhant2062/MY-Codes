package KMP_algo;
import java.util.*;
public class kmp_algo_naive {
	static void kmp(String s,String p) {
		int i=0;
		int j=0;
		int temp=0;
		while(i<s.length()&&j<p.length()) {
			if(s.charAt(i)==p.charAt(j)) {
				i++;
				j++;
			}else {
				while(s.charAt(i)!=p.charAt(j)&&j>0) {
					j--;
				}
				if(s.charAt(i)==p.charAt(j)) {
					temp=i-j;
					i++;
					j++;
				}else {
					i++;
				}
			}
		}
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String p=sc.next();
		kmp(s,p);
	}
}
