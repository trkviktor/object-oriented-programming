package homework;

import homework.product.Product;

public class EBook extends Book{
	
	private String url;

	public EBook(String author, String title, int price, int pages, String style, String url) {
		super(author, title, price, pages, style);
		this.url = url;
	}

	
	
	@Override
	public String toString() {
		return "EBook [url=" + url + ", getStyle()=" + getStyle() + ", getPages()=" + getPages() + ", getAuthor()="
				+ getAuthor() + ", getTitle()=" + getTitle() + ", getYearOfPublication()=" + getYearOfPublication()
				+ ", getPrice()=" + getPrice() + "]";
	}



	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	
	


}
