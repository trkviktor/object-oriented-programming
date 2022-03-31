package mypackage.myproducts;

public class Bread extends Product{
	
	private double amount;

	
	
	public Bread(String name, int price, double amount) {
		super(name, price);
		this.amount = amount;
	}

	public static boolean compare(Bread b1, Bread b2) {
		return b1.getUnitPrice()<b2.getUnitPrice();
	}

	
	@Override
	public String toString() {
		return "Bread [amount=" + amount + ", getUnitPrice()=" + getUnitPrice() + ", getName()=" + getName()
				+ ", getPrice()=" + getPrice() + "]";
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	@Override
	public int getUnitPrice() {
		return (int)(this.getPrice()/(double)amount);
	}
	
	

}
