package homework.tax;

public abstract interface Taxable {
	
	public double taxPercent = 27;
	
	public void setTax(double tax);
	public double getTax();
	
	public double getTaxedValue();

}
