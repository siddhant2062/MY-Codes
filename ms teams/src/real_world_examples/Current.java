package real_world_examples;

public class Current extends BankAccount {

	Current() {
		super("Siddhant", "2010990686");
	}

	void withdraw(double amount) {
		if (amount != 0) {
			balance = balance - amount;
			previousTransaction = -amount;
		}

	}
}