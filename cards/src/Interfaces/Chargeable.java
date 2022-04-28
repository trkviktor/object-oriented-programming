package Interfaces;

import cards.CardException;

public interface Chargeable {
	
	public boolean ChargeFee(int amount) throws CardException;
	
}
