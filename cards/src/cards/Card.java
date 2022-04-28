package cards;

import java.time.LocalDate;
import java.time.LocalTime;

public class Card {
	private String name;
	private LocalDate valid;
	private Bank bank;
	private int balance;
	
	
	public Card(String name, LocalDate valid, Bank bank, int balance) {
		super();
		this.name = name;
		this.valid = valid;
		this.bank = bank;
		this.balance = balance;
	}
	
	public boolean MoneyWithdrawal(int amount) {
		if(balance >= amount && valid.compareTo(LocalDate.now()) > 0) {
			balance -= amount;
			return true;
		} else {
			return false;
		}
	}
	
	@Override
	public String toString() {
		return "Card [name=" + name + ", valid=" + valid + ", bank=" + bank + ", balance=" + balance + "]";
	}

	public int getBalance() {
		return balance;
	}
	
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public Bank getBank() {
		return bank;
	}
	
	public void setBank(Bank bank) {
		this.bank = bank;
	}
	
	public LocalDate getValid() {
		return valid;
	}
	
	public void setValid(LocalDate valid) {
		this.valid = valid;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
	
}
