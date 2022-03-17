package second;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		RandomNumberThresholdCheck(9.99,0.0,100.0);
		RandomNumberThresholdCheck(53.63,0.0,100.0);
	}
	
	public static void RandomNumberThresholdCheck(double input, double min, double max) {
		boolean ok = false;
		int count = 0;
		Random rd = new Random();
		Number nmb = new Number(input);
		while(!ok) {
			if(nmb.isWithinThreshold(min + (max - min + 1) * rd.nextDouble()))
				ok = true;
			else
				count++;
		}
		System.out.println("Matched " + input + " in " + count + " tries.");
	}

}
