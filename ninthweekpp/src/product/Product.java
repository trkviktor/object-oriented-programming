package product;

import product.interfaces.Sellable;

public abstract class Product implements Sellable {

	private String name;
	private int price;
	private String currency;
	
	public abstract int getUnitPrice();
	
	public void increasePrice(int percentage) {
		if (percentage > 0) {
			price += Math.round(price*(float)percentage/100);
		}	
	}
	
	public void decreasePrice(int percent) {
		price -= Math.round(price*(float)percent/100);
	}
	
	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + "]";
	}



	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public int getPrice() {
		return price;
	}




	public void setPrice(int price) {
		if(price >= 0)
			this.price = price;
	}

	@Override
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	
	@Override
	public String getCurrency() {
		return currency;
	}

	public Product(String name, int price) {
		this.name = name;
		if(price >= 0)
			this.price = price;
		this.currency = Sellable.currency;
	}
	
	public Product(String name, int price, String currency) {
		this.name = name;
		if(price >= 0)
			this.price = price;
		this.currency = currency;
	}
	
	
	
}