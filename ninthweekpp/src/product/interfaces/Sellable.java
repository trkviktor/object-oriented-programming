package product.interfaces;

public interface Sellable {
	
	public int price = 1;
	public String currency = "JMF";
	
	public void setPrice(int price);
	public int getPrice();
	
	public void setCurrency(String currency);
	public String getCurrency();

}
