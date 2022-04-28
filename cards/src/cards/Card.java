package cards;

import java.time.LocalDate;
import java.time.LocalTime;

import Interfaces.Chargeable;

public class Card implements Chargeable{
	
	private String name;
	private LocalDate valid;
	private Bank bank;
	private int balance;
	private int cardFee;
	
	
	public Card(String name, LocalDate valid, Bank bank, int balance) {
		super();
		this.name = name;
		this.valid = valid;
		this.bank = bank;
		this.balance = balance;
		switch(bank) {
		case CIB:
			this.cardFee = 200;
			break;
		case ERSTE:
			this.cardFee = 300;
			break;
		case KNH:
			this.cardFee = 400;
			break;
		case OTP:
			this.cardFee = 500;
			break;
		default:
			this.cardFee = 100;
			break;
		}
	}
	
	public boolean MoneyWithdrawal(int amount) throws NotEnoughCreditException {
		if(balance >= amount && valid.compareTo(LocalDate.now()) > 0) {
			balance -= amount;
			System.out.println("Pénzfelvét: " + amount + " Sikeres Új egyenleg: " + balance);	
			return true;
		} else {
			System.out.println("Pénzfelvét: " + amount + " Sikertelen Új egyenleg: " + balance);
			throw new NotEnoughCreditException();
			
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

	@Override
	public boolean ChargeFee(int amount) throws NotEnoughCreditException {
		if(balance >= amount) {
			balance -= amount;
			return true;
		} 
		
		throw new NotEnoughCreditException();
		
		
	}
	
	
	
	
	
}
