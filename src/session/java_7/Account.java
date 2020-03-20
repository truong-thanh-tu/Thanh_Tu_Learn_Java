package session;

public class Account {
	private int accountNumber;
	private double balance;
	
	public Account(int accountNumber, double balance) {
		this.accountNumber =  accountNumber;
		this.balance = balance;
	}
	
	public Account(int accounNumber) {
		this.accountNumber = accounNumber;
		this.balance = 0.0;
	}
	public double getBalance() {
		return this.balance;
	}
	public int getAccountNumber() {
		return this.accountNumber;
	}
	public void setBalance (double balance) {
		this.balance = balance;
	}
	public void credit(double amount) {
		balance += amount;
	}
	public void debit(double amount) {
		if(balance < amount) {
			System.out.println("Amount withdraw exceeds the current balance!");
		}
		else {
			balance -= amount;
		}
	}
	public String toString() {
		return String.format("A/C no:%d, Balance = %.2f",accountNumber,balance);
	}
	
}
