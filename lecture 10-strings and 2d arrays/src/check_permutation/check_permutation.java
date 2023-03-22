package check_permutation;
import java.util.Scanner;
public class check_permutation {
	public static String take_input(){
		Scanner s=new Scanner(System.in);
		
		String str=s.nextLine();		
		return str;
	}
	public static String take_input1() {
		Scanner s=new Scanner(System.in);
		
		String str=s.nextLine();
		return str;
	}
	public static void check_permutation(String s,String t) {
		
		int size1=s.length();
		int size2=t.length();
		if(size1>size2||size1<size2) {
			return;
		}
		int sum_s=0;
		int sum_t=0;
		for(int i=0;i<size1;i++) {
	    sum_s=sum_s+s.charAt(i);					
		}
		for(int j=0;j<size2;j++) {
		sum_t=sum_t+t.charAt(j);
			}
		if(sum_t==sum_s) {
			System.out.println("both strings are permutation of each other");
		}else {
			System.out.println("both strings are not permutation of each other");
		}
	}
	public static void main(String args[]) {
		//Scanner sc=new Scanner(System.in);
		
		//int size1=sc.nextInt();
		String s=take_input();
		//int size2=sc.nextInt();		
		String t=take_input1();
		check_permutation(s,t);
		
	}

}
