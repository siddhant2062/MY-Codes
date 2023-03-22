package check_palindrome;

import java.util.Scanner;

public class check_palindrome {
	public static String take_input() {
		Scanner s = new Scanner(System.in);

		String str = s.nextLine();
		return str;
	}

	public static void palindrome(String str) {

		int size = str.length();
		int i = size - 1;
		String rev = "";
		while (i >= 0) {
			rev = rev + str.charAt(i);
			i--;
		}
		if (str.equals(rev)) { // note:- when we compare two arrays or two strings than it don't compare the
								// data, actually it compares their addresses, so we use .equals() which
								// compares address.
			System.out.println(str + " is an palindrome no");
		} else {
			System.out.println(str + " is not an palindrome no");
		}

	}

	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);

		String a = take_input();
		palindrome(a);
		// System.out.println(b);
	}

}
