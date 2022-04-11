package homework;

import java.time.LocalDate;
import java.util.Hashtable;

import homework.product.Product;

public class Book extends Product{
	private String author;
	private String title;
	private final LocalDate yearOfPublication;
	private int pages;
	private String style;

	
	
	
	public Book(String author, String title, int price, int pages, String style) {
		super("book", price, 5);
		this.author=author;
		this.title=title;
		this.style=style;
		this.yearOfPublication=LocalDate.now();
		if(pages < 0)
			this.pages=0;
		else
			this.pages=pages;
		
	}

	
	public Book(String author, String title, String style) {
		super("book", 2500, 5);
		this.author=author;
		this.title=title;
		this.style=style;
		this.pages=100;
		this.yearOfPublication=LocalDate.now();
	}
	
	public static int sumGrossPrice(Book[] books) {
		int total = 0;
		for(Book bk : books) {
			total += bk.getTaxedValue();
		}
		return total;
			
	}
	
	public static String[] selectAuthors(Book[] books, int unitPrice) {
		
		Hashtable<Integer, String> dict = new Hashtable<Integer, String>();
		int x = 0;
		for(int i = 0; i < books.length; i++) {
			//System.out.println("TEST: " + books[i].getAuthor() + books[i].getUnitPrice());
			if(!(dict.contains(books[i].getAuthor())) && books[i].getUnitPrice()>unitPrice)
			{
				dict.put(x, books[i].getAuthor());
				x++;
			}
		}
		
		String[] array = new String[dict.size()];
		for(int i = 0; i < array.length; i++) {
			array[i] = dict.get(i);
			System.out.println(array[i]);
		}
		return array;
		
	}
	
	
	
	public static int listBooksWithStyle(Book[] books, String style) {
		int cnt = 0;
		for(Book bk : books) {
			if(bk.getStyle().equalsIgnoreCase(style)) {
				System.out.println(bk);
				cnt++;
			}
		}
		return cnt;
	}
	
	public static void discountBooks(Book[] books, String style) {
		for(int i = 0; i < books.length; i++) {
			if(books[i].getStyle().equalsIgnoreCase(style))
			{
				books[i].decreasePrice(10);
			}
		}
	}
	
	public static int avgPrice(Book[] books, String style) {
		int total = 0;
		int count = 0;
		for(Book bk : books) {
			if (bk.getStyle().equalsIgnoreCase(style)){
				total += bk.getPrice();
				count++;
			}
		}
		if(count == 0)
			return 0;
		else
			return total/count;
	}
	
	public static int countStyles(Book[] books) {
		String[] array = new String[books.length];
		int diffStyleCnt = 0;
		
		for(int i = 0; i < books.length; i++) {
			boolean ok = true;
			for(int j = 0; j < array.length; j++) {
				if(books[i].getStyle().equalsIgnoreCase(array[j])) {
					ok = false;
				}
					
			}
			if(ok)
				diffStyleCnt++;
			
			array[i] = books[i].getStyle();
		}
		return diffStyleCnt;
	}
	
	
	@Override
	public void decreasePrice(int percent) {
		if(getStyle().equalsIgnoreCase("children"))
			super.decreasePrice(percent+7);
		else if (getStyle().equalsIgnoreCase("guide"))
			super.decreasePrice(percent+5);
		else
			super.decreasePrice(percent);
	}
	
	

	public static Book getLongestEvenPagesBook(Book[] books) {
		Book max = null; 
		for(int i = 0;i < books.length; i++) {
			if((max == null || max.pages < books[i].pages) && (books[i].pages%2)==0)
				max = books[i];
		}
		return max;
	}
	
	public static Book getLonger(Book bookA, Book bookB) {
		if(bookA.pages < bookB.pages)
			return bookB;
		else if(bookA.pages == bookB.pages)
			return bookA;
		else {
			return bookA;
		}
	}
	
	public static Book getLongestBook(Book[] books) {
		Book longest = books[0];
		for(int i = 1; i < books.length; i++){
			if(longest.pages < books[i].pages)
				longest = books[i];
		}
		return longest;
	}
	
	public boolean hasEvenPages() {
		if(this.pages %2 == 0)
			return true;
		else
			return false;
	}
	
	public static void listBookArray(Book[] books) {
		for(Book book: books) {
			System.out.println(book);
		}
	}
	
	public static void authorStatistics(Book[] books) {
		String[] array = new String[books.length];
		for(int i = 0;i < books.length;i++) {
			int count = 0;
			boolean ok = true;
			
			for(int k = 0;k < array.length;k++) {
				if(books[i].author.equalsIgnoreCase(array[k]))
					ok = false;
			}
			
			if(ok) {
				for(int j = i;j < books.length; j++) {
					if(books[i].author.equalsIgnoreCase(books[j].author)) {
						count++;
					}
				}
				System.out.println(books[i].author + "'s published books: " + count);
				
			}
			array[i] = books[i].author;
			
			
		}
	}
	
	

	@Override
	public String toString() {
		return "Book [author=" + author + ", title=" + title + ", pages=" + pages + ", style=" + style
				+ ", getPrice()=" + getPrice() + ", getYearOfPublication()=" + getYearOfPublication() + ", getUnitPrice()=" + getUnitPrice() + "]";
	}
	
	

	
	
	public String getStyle() {
		return style;
	}

	public void setStyle(String style) {
		this.style = style;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		if(pages % 2 == 0)
			this.pages = pages;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getYearOfPublication() {
		return yearOfPublication.getYear();
	}

	public static int comparePublicationDate(Book bookA, Book bookB) {
		if(bookA.getYearOfPublication()>bookB.getYearOfPublication()) {
			return 1;
		}
		else if(bookA.getYearOfPublication()<bookB.getYearOfPublication()) {
			return 2;
		}
		else {
			return 0;
		}
		
	}


	@Override
	public int getUnitPrice() {
		//System.out.println((int)Math.round(this.getTaxedValue()/pages));
		return (int)Math.round(this.getTaxedValue()/pages);
	}
	
	

}