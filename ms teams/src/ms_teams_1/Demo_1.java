package ms_teams_1;

import java.util.Scanner;

class Create_contact {
	String name;
	long num1;
	long num2;

	void contact(String name, long num) {
		this.name = name;
		this.num1 = num;
		System.out.println("Contact Name: " + this.name + "\n" + "Contact Number: " + this.num1);
	}

	void contact(String name, long num1, long num2) {
		this.name = name;
		this.num1 = num1;
		this.num2 = num2;
		System.out.println("Contact Name: " + this.name + "\n" + "Contact Number: " + this.num1 + "\n"
				+ "Alternate Number: " + this.num2);
	}
}

class Demo_1 {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);

		String name = s.nextLine();
		long num1 = s.nextLong();
		Create_contact c1 = new Create_contact();
		c1.contact(name, num1);

		long num2 = s.nextLong();
		c1.contact(name, num1, num2);
	}

}
