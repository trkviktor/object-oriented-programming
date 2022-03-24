package mypackage;

import mypackage.myproducts.Bread;
import mypackage.myproducts.Product;

public class ProductTest {

	public static void main(String[] args) {
		Product p1 = new Product("Cajgli", 40024, 12);
		Bread b1 = new Bread("wheat bread", 200, 15, 7.5);
		
		System.out.println(p1);
		System.out.println(b1);
		System.out.println(p1.getGrossPrice());
		System.out.println(b1.getGrossPrice());
		
		Product b2 = new Bread("bred", 250, 35, 3.5);
		System.out.println(b2);
		
		Product.compare(p1, b1);
		Product.compare(p1, b2);
		
		System.out.println(Bread.compare(b2, b1));
		
	}

}
