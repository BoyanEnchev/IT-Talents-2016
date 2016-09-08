import java.time.LocalDateTime;

import exceptions.ProductException;

public class TextBook extends Product{
	
	private String theme;

	public TextBook(String title, String publisher, LocalDateTime publishDate) throws ProductException {
		super(title, publisher, publishDate);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int compareTo(Object textbook) {
		
		return this.getTitle().compareTo(((TextBook) textbook).getTitle());
	}

}
