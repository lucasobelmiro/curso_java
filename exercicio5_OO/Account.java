package exercicio5_OO;

public class Account {
	
	private int number;
	private String name;
	private double balance;
	
	public Account(int number, String name) {
		this.number = number;
		this.name = name;
	}
	
	public Account(int number, String name, double initialDeposit) {
		this.number = number;
		this.name = name;
		deposit(initialDeposit);
	}
	
	public int getNumber() {
		return this.number;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public double getBalance() {
		return this.balance;
	}
	
	public void deposit(double value) {
		this.balance += value;
	}
	
	public void withdraw(double value) {
		this.balance -= (value + 5.00);
	}
	
	public String toString() {
		return "Account " + this.number
				+ ", Holder: " + this.name
				+ ", Balance: $ " + String.format("%.2f", this.balance);
	}
}