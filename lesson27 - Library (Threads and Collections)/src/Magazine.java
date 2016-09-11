import java.time.LocalDateTime;

import exceptions.ProductException;

public class Magazine extends Product {
	
	private String author;
	private String category;
	private int number;

	public Magazine(String title, String publisher, LocalDateTime publishDate, int number) throws ProductException {
		super(title, publisher, publishDate);
		this.number = number;
	}

	@Override
	public int compareTo(Object magazine) {
		
		if(this.getTitle().equals(((Magazine) magazine).getTitle())){
			return number - ((Magazine) magazine).getNumber();
		}
		
		return this.getTitle().compareTo(((Magazine) magazine).getTitle());
		
	}

	protected int getNumber() {
		return number;
	}

}
