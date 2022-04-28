package app;

import product.Book;
import product.Estate;
import product.Product;

public class App {

	public static void main(String[] args) {
		Product book1 = new Book("Kasd", "Fasd", 2500, 300, "children");
		Product estate1 = new Estate(1502000, 50, "Miskolc");
		
		printProduct(book1);
		CurrencyConversion(book1);
		printProduct(book1);
		
		printProduct(estate1);
		CurrencyConversion(estate1);
		printProduct(estate1);
		CurrencyConversion(estate1);
		printProduct(estate1);
		
		
				
	}
	
	public static void CurrencyConversion(Product product) {
		if(product.getCurrency().equalsIgnoreCase("JMF"))
			product.setCurrency("EUR");
		else
			product.setCurrency("JMF");
			
	}
	
	public static void printProduct(Product product) {
		System.out.println(product);
	}

}
