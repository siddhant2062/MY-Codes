package real_world_examples;

import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		char option = '\0';
		Scanner s = new Scanner(System.in);

		do {
			System.out.println("A. Savings Account");
			System.out.println("B. Current Account");
			System.out.println("C. Exit");
			System.out.println("Enter an Option");
			option = s.next().charAt(0);
			System.out.println();

			switch (option) {
			case 'A':
				Savings s1 = new Savings();
				s1.showMenu();
				break;

			case 'B':
				Current c1 = new Current();
				c1.showMenu();
				break;

			case 'C':
				System.out.println("******************************************************");
				break;

			default:
				System.out.println("Invalid Choice");
				break;
			}
		} while (option != 'C');
		System.out.println("Thank You for using our services!!!!");


	}

}
