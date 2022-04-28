package Tests;

import java.time.LocalDate;
import java.util.Arrays;

import cards.*;

public class CardTest {

	public static void main(String[] args) throws NotEnoughCreditException {
		Card[] cards = new Card[4];
		cards[0] = new CreditCard("Kiss Tamás",LocalDate.of(2020,04,30),Bank.OTP,150000,100000);
		cards[1] = new Card("Nagy Levente",LocalDate.of(2022,05,31),Bank.ERSTE,100000);
		cards[2] = new CreditCard("Szabó László",LocalDate.of(2019,03,31),Bank.OTP,200000,100000);
		cards[3] = new Card("Kovács Edit",LocalDate.of(2021,01,31),Bank.CIB,250000);
		
		cards[0].MoneyWithdrawal(280000);
		cards[1].MoneyWithdrawal(80000);
		cards[2].MoneyWithdrawal(50000);
		cards[3].MoneyWithdrawal(100000);
		System.out.println("CIB kártyák száma: " + CountCIBUsers(cards));
		SortArrayByDate(cards);
		PrintArray(cards);
		
		
		cards[0].ChargeFee(200);
		cards[2].ChargeFee(300);
		System.out.println("\n" + cards[0] + "\n" + cards[2]);
		
		
		
		
 	}
	
	public static void PrintArray(Card[] cards) {
		for(var c : cards) {
			System.out.println(c);
		}
	}
	
	public static void SortArrayByDate(Card[] cards) {
		Arrays.sort(cards, (a, b) -> a.getValid().compareTo(b.getValid()));
	}
	
	public static int CountCIBUsers(Card[] cards) {
		int count = 0;
		for(var c : cards) {
			if(c.getBank() == Bank.CIB)
				count++;
		}
		return count;
	}
	
	public static int ReadNmbr(int min, int max) {
		return 0; //todo
	}

}

