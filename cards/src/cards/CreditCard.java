package cards;

import java.time.LocalDate;

public class CreditCard extends Card {
	
	private int credit;

	public CreditCard(String name, LocalDate valid, Bank bank, int balance) {
		super(name, valid, bank, balance);
		this.credit = 100_000;
	}
	
	public CreditCard(String name, LocalDate valid, Bank bank, int balance, int credit) {
		super(name, valid, bank, balance);
		this.credit = credit;
	}
	
	@Override
	public boolean MoneyWithdrawal(int amount) {
		if(super.getBalance() < amount && super.getValid().compareTo(LocalDate.now()) > 0 && credit >= amount) {
			credit -= amount;
			return true;
		}
	}
	
	

}
