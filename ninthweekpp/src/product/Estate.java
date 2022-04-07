package product;

import product.interfaces.Sellable;

public class Estate implements Sellable{

	private int price;
	private String currency;
	private int size;
	private String city;
	
	public Estate(int price, int size, String city) {
		this.price = price;
		this.size = size;
		this.city = city;
		this.currency = Sellable.currency;
	}
	
	
	public int squareMeter() {
		return size * price;
	}
	
	
	@Override
	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public int getPrice() {
		return price;
	}

	@Override
	public void setCurrency(String currency) {
		this.currency = currency;
	}

	@Override
	public String getCurrency() {
		return currency;
	}


	@Override
	public String toString() {
		return "Estate [price=" + price + ", currency=" + currency + ", size=" + size + ", city=" + city + "]";
	}
	
	
	
	
}
