package real_world_examples;

import java.util.Scanner;

public class BankAccount {
	double balance;
	double previousTransaction;
	String customerName;
	String customerId;

	public BankAccount(String customerName, String customerId) {
		this.customerName = customerName;
		this.customerId = customerId;
	}

	void deposit(double amount) {
		if (amount != 0) {
			balance = balance + amount;
			previousTransaction = amount;
		}
	}

	void withdraw(double amount) {
		if (balance <= 0 || amount > balance) {
			System.out.println("Sorry, Your Account Balance is Low");
			return;
		} else {
			balance = balance - amount;
			previousTransaction = -amount;
		}

	}

	void getpreviousTransaction() {
		if (previousTransaction > 0) {
			System.out.println("Deposited: " + previousTransaction);
		} else if (previousTransaction < 0) {
			System.out.println("Withdraw: " + Math.abs(previousTransaction));
		} else {
			System.out.println("No transaction occured");
		}
	}

	void showMenu() {

		char option = '\0'; // null/empty char
		Scanner s = new Scanner(System.in);

		System.out.println("Welcome " + customerName);
		System.out.println("your ID is " + customerId);
		System.out.println();
		System.out.println("A. Check Balance");
		System.out.println("B. Deposit");
		System.out.println("C. Withdraw");
		System.out.println("D. Previous Transaction");
		System.out.println("E. Exit");

		do {
			System.out.println("Enter an option");
			option = s.next().charAt(0);
			System.out.println();

			switch (option) {

			case 'A':
				System.out.println("Balance = " + balance);
				System.out.println();
				break;

			case 'B':
				System.out.println("Enter an Amount to Deposit");
				double amount = s.nextDouble();
				deposit(amount);
				System.out.println("Your Current Balance = " + balance);
				System.out.println();
				break;

			case 'C':
				System.out.println("Enter an Amount to Withdraw");
				double amount2 = s.nextDouble();
				withdraw(amount2);
				System.out.println("Your Current Balance = " + balance);
				System.out.println();
				break;

			case 'D':
				getpreviousTransaction();
				System.out.println();
				break;

			case 'E':
				System.out.println("******************************************************");
				break;

			default:
				System.out.println("Invalid Choice");
				break;
			}
		} while (option != 'E');
		System.out.println("Returned To Main Slide");
		System.out.println("\n");
	}
}
