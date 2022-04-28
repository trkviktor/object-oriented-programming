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
	public boolean ChargeFee(int amount) throws NotEnoughCreditException {
		if(super.getBalance() >= amount) {
			super.setBalance(super.getBalance()-(amount+50));
			return true;
		}
		throw new NotEnoughCreditException();
	}
	
	@Override
	public boolean MoneyWithdrawal(int amount) throws NotEnoughCreditException {
		if(super.getBalance() >= amount && super.getValid().compareTo(LocalDate.now()) > 0) {
			super.setBalance(super.getBalance()-amount);
			System.out.println("Pénzfelvét: " + amount + " Sikeres Új egyenleg: " + super.getBalance() + " Hitelkeret: " + credit);	
			return true;
		} else if(credit >= amount){
			credit -= amount;
			System.out.println("Pénzfelvét: " + amount + " Sikeres Új egyenleg: " + super.getBalance() + " Hitelkeret: " + credit);		
			return true;
		}
		System.out.println("Pénzfelvét: " + amount + " Sikertelen Új egyenleg: " + super.getBalance() + " Hitelkeret: " + credit);
		throw new NotEnoughCreditException();
	

	}
	
	@Override
	public String toString() {
		return "CreditCard [credit=" + credit + ", getBalance()=" + getBalance() + ", getBank()=" + getBank()
				+ ", getValid()=" + getValid() + ", getName()=" + getName() + "]";
	}

	public int getCredit() {
		return credit;
	}

	public void setCredit(int credit) {
		this.credit = credit;
	}
	
	
}
