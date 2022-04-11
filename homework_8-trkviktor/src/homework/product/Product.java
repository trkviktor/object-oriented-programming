package homework.product;

import homework.tax.Taxable;

public abstract class Product implements Taxable{

	private String name;
	private int price;
	private double taxPercent=Taxable.taxPercent;
	private String currency = "Ft";
	
	
	public Product(String name, int price, double taxPercent) {
		super();
		this.name=name;
		if(price < 0)
			this.price=0;
		else
			this.price=price;
		
		if(taxPercent < 0)
			this.taxPercent=Taxable.taxPercent;
		else
			this.taxPercent=taxPercent;
	}
	
	public Product(String name, int price) {
		super();
		this.name = name;
		if(price >= 0)
			this.price = price;
	}
	
	public abstract int getUnitPrice();
	
	public static int comparePrice(Product p1, Product p2) {
		if(p1.price>p2.price)
			return 1;
		else if (p1.price<p2.price)
			return 2;
		else
			return 0;
	}
	
	public static void changeCurrency(Product[] products, String targetCurrency) {
		for(int i = 0; i < products.length; i++) {
			if(!products[i].currency.equalsIgnoreCase(targetCurrency))
				products[i].setCurrency(targetCurrency);
		}
	}
	
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
		return "Product [name=" + name + ", price=" + price + ", getTaxedValue()=" + getTaxedValue() + "]";
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
	public void setTax(double tax) {
		if(tax <= 0) {
			this.taxPercent=Taxable.taxPercent;
			return;
		}
		
		this.taxPercent=tax;
	}

	@Override
	public double getTax() {
		return price*(taxPercent/100);
	}

	@Override
	public double getTaxedValue() {
		return ((double)price)+getTax();
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		switch(currency.toUpperCase()) {
			case "FT":
				this.currency = currency;
				this.price *= 300;
				break;
			case "EURO":
				this.currency = currency;
				this.price /= 300;
				break;
			default:
				this.currency = "Ft";
		}
	}
	
	
	
	
	
}
