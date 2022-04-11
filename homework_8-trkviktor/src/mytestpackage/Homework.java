package mytestpackage;

import java.util.Scanner;

import homework.Book;
import homework.EBook;
import homework.product.Product;

public class Homework {
	
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args)  {
//		EBook[] EBookTemp = {new EBook("pasd","kasd",534,92,"guide","guide.com"),
//		   new EBook("rasd","dasd",234,22,"children","childrenbook.com"),
//		   new EBook("rasd","fasd",934,52,"guide","guidebook.com")};
		
		EBook[] EBooks = new EBook[read(1,10)];
		fillEBooks(EBooks);
		
		Product.changeCurrency(EBooks, "Euro");
		System.out.println(Product.comparePrice(EBooks[0], EBooks[2]));
		Book.selectAuthors(EBooks, 120);
		System.out.println(Book.sumGrossPrice(EBooks));
		
		
		

	}
	
	public static void fillEBooks(EBook[] EBooks) {
		for(int i = 0; i < EBooks.length; i++) {
			String inp;
			boolean ok;
			do {
				System.out.println("Author,title,price,pages,style,url:");
				inp = input.nextLine();
				String[] strArray = inp.split(",");
				ok = true;
			try {
				EBook EBook = new EBook(strArray[0],strArray[1],Integer.parseInt(strArray[2])
						,Integer.parseInt(strArray[3]),strArray[4],strArray[5]);
				EBooks[i] = EBook;
				
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
