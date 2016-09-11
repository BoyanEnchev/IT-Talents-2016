import java.time.LocalDateTime;
import java.time.chrono.ChronoLocalDateTime;

import exceptions.ProductException;

public class Book extends Product{
	
	private String author;
	private String jenre;

	public Book(String title, String publisher, LocalDateTime publishDate) throws ProductException {
		super(title, publisher, publishDate);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int compareTo(Object book) {
		
		return this.getPublishDate().compareTo(((Product) book).getPublishDate());
	}
	
	

}
