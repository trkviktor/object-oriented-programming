package mypackage.myproducts;

public class Product {
	
	private String name;
	private int netPrice;
	private int vat;
	
	public int getGrossPrice() {
		double vatAmount = netPrice*((double)vat/100.0);
		return (int)(vatAmount+netPrice);
	}
	
	public static boolean compare(Product p1, Product p2) {
		return p1.getGrossPrice()<p2.getGrossPrice();
	}
	
	@Override
	public String toString() {
		return "Product [name=" + name + ", netPrice=" + netPrice + ", vat=" + vat + "]";
	}

	public Product(String name, int netPrice, int vat) {
		super();
		this.name = name;
		this.netPrice = netPrice;
		this.vat = vat;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNetPrice() {
		return netPrice;
	}
	public void setNetPrice(int netPrice) {
		this.netPrice = netPrice;
	}
	public int getVat() {
		return vat;
	}
	public void setVat(int vat) {
		this.vat = vat;
	}
	
	

}
