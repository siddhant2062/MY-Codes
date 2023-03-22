package check_palindrome;

import java.util.Scanner;

public class r {
	public static String[] take_input() {
		Scanner s = new Scanner(System.in);

		int size = s.nextInt();
		String str[] = new String[size];

		for (int i = 0; i < size; i++) {
			str[i] = s.nextLine();
		}
		return str;
	}

	public static void palindrome(String str[]) {

//		int count=0;
		for (int i = 0; i < str.length; i++) {
			
			int j = str[i].length() - 1;
			String rev = "";
			while (j >= 0) {
				rev = rev + str[i].charAt(j);
				j--;
			}
			if (str[i].equals(rev)) {
				System.out.println(str[j] + " is an palindrome no");
//			count=count+1;

			} else {
				System.out.println(str[j] + " is not an palindrome no");
			}

		}

	}

	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);

		String a[] = take_input();
		palindrome(a);
//		System.out.println(count);

	}

}
