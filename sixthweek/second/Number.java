package second;

public class Number {
	
	private double number;
	private static final double epsilon = 0.001;
	
	public boolean isWithinThreshold(double inNumber) {
		return Math.abs(number - inNumber) <= epsilon;
	}
	
	public Number(double number) {
		super();
		this.number = number;
	}
	public double getNumber() {
		return number;
	}
	public void setNumber(double number) {
		this.number = number;
	}
	public static double getEpsilon() {
		return epsilon;
	}
	
	

}
