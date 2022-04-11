package mypackage;

import java.util.Arrays;
import java.util.Scanner;

import mypackage.myproducts.Book;
import mypackage.myproducts.Bread;
import mypackage.myproducts.Product;


public class ProductTest {

	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		Product[] products = new Product[read(1,10)];
		fillProducts(products);
		sortArray(products);
		printUnitPrices(products);
		GreaterThanTwentyFtPerPage(products);
		
	}
	
	public static void GreaterThanTwentyFtPerPage(Product[] products) {
		String[] array = new String[products.length];
		for(int i = 0; i < products.length;i++) {
			if(products[i] instanceof Book) {
				boolean ok = true;
				
				for(int k = 0;k < array.length;k++) {
					if(((Book)products[i]).getAuthor().equalsIgnoreCase(array[k]))
						ok = false;
				}
				
				if(ok) {
					if(((Book)products[i]).getUnitPrice() > 20){
						System.out.println(((Book)products[i]).getAuthor());
					}
					
				}
				array[i] = ((Book)products[i]).getAuthor();
			}
		}
	}
	
	public static void printUnitPrices(Product[] products) {
		for(Product p : products) {
			System.out.println(p.getUnitPrice());
		}
	}
	
	public static void sortArray(Product[] products) {
		Arrays.sort(products, (a,b) -> a.getUnitPrice()-b.getUnitPrice());
	}
	
	public static void fillProducts(Product[] products) {
		for(int i = 0; i < products.length; i++) {
			String inp;
			boolean ok;
			do {
				System.out.println("Product type(Book,Bread): ");
				inp = input.nextLine();
			try {
				String[] strArray = inp.split(",");
				switch(inp.toUpperCase()) {
				case "BOOK":
					System.out.println("Author,title,price,pages,style:");
					inp = input.nextLine();
					strArray = inp.split(",");
					products[i] = new Book(strArray[0],strArray[1],Integer.parseInt(strArray[2]),Integer.parseInt(strArray[3]),strArray[4]);
					ok = true;
					break;
				case "BREAD":
					System.out.println("Name,price,amount: ");
					inp = input.nextLine();
					strArray = inp.split(",");
					products[i] = new Bread(strArray[0],Integer.parseInt(strArray[1]),Integer.parseInt(strArray[2]));
					ok = true;
					break;
				default:
					System.out.println("No such type");
					ok = false;
				}
			}
			catch (Exception e) {
				ok = false;
			}
			}while(!ok);
			
		}
	}
	
	public static int read(int min, int max) {
        int number = 0;
        do {
            System.out.println("Give me a number between " + min + " and " + max + "!");
            while (!input.hasNextInt()) {
                System.out.println("Bad input format!");
                input.next();
            }
            number = input.nextInt();
            input.nextLine();
        } while (number < min || number > max);
        return number;
    }
}


