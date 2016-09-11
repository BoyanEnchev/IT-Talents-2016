import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

import exceptions.ProductException;

public abstract class Product implements Comparable {

	private String title;
	private String publisher;
	private LocalDateTime publishDate;
	
	private Set<History> history = new HashSet<>();
	
	public Product(String title, String publisher, LocalDateTime publishDate) throws ProductException{
		
		if(title != null){
			this.title = title;
		}else
			throw new ProductException("Invalid product title!");

		if(publisher != null){
			this.publisher = publisher;
		}else
			throw new ProductException("Invalid product publisher!");
		if(publishDate != null){
			this.publishDate = publishDate;
		}else
			throw new ProductException("Invalid product publish Date!");
	}

	public LocalDateTime getPublishDate() {
		return publishDate;
	}

	protected String getTitle() {
		return title;
	}

	@Override
	public String toString() {
		return "Product [title=" + title + ", publisher=" + publisher + ", publishDate=" + publishDate + ", history="
				+ history + "]";
	}
	
}
