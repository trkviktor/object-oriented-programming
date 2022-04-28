package Interfaces;

import cards.NotEnoughCreditException;

public interface Chargeable {
	
	public boolean ChargeFee(int amount) throws NotEnoughCreditException;
	
}
