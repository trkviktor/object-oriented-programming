package mypackage.myproducts;

public class Bread extends Product{
	
	private double amount;

	public Bread(String name, int netPrice, int vat,double amount) {
		super(name, netPrice, vat);
		this.amount = amount;
	}
	
	public static boolean compare(Bread b1, Bread b2) {
		return b1.getGrossPrice()<b2.getGrossPrice();
	}

	@Override
	public String toString() {
		return "Bread [getName()=" + getName() + ", getNetPrice()=" + getNetPrice() + ", getVat()=" + getVat() + "]";
	}



	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	

}
