import java.time.LocalDateTime;

import exceptions.LibraryException;
import exceptions.ProductException;

public class Demo {

	public static void main(String[] args) {
		
		Library library = new Library();
		
		try {
			library.addProduct(new Book("Pod Igoto", "Ivan Vazov", LocalDateTime.now()), "book", "roman");
			library.addProduct(new Book("Izneverya", "Paolo Coelho", LocalDateTime.now()), "book", "drama");
			library.addProduct(new Book("Geracite", "Elin Pelin", LocalDateTime.now()), "book", "roman");
			library.addProduct(new Book("Tiutiun", "Dimitar Dimov", LocalDateTime.now()), "book", "roman");
			library.addProduct(new Book("Orient Express", "Agatha Christie", LocalDateTime.now()), "book", "thriler");
			library.addProduct(new Book("Romeo i Julieta", "Shekspir", LocalDateTime.now()), "book", "drama");
			
			library.addProduct(new Magazine("Top Gear", "Nekvi Nemci", LocalDateTime.now(), 5), "magazine", "cars");
			library.addProduct(new Magazine("Cosmopolitan", "Adelina", LocalDateTime.now(), 3), "magazine", "fashion");
			library.addProduct(new Magazine("Top Gear", "Nekvi Nemci", LocalDateTime.now(), 4), "magazine", "cars");
			library.addProduct(new TextBook("Mathematika za 7 class","Anubis", LocalDateTime.now()), "textbook", "math");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			library.addProduct(new Book("Tiutiun2", "Dimitar Dimov", LocalDateTime.now()), "book", "roman");
			library.addProduct(new Book("Orient Express2", "Agatha Christie", LocalDateTime.now()), "book", "thriler");
			library.addProduct(new Book("Romeo i Julieta2", "Shekspir", LocalDateTime.now()), "book", "drama");
			
			System.out.println("\n-------------------------------------\n");
			library.printCatalog();
			
			
		} catch (LibraryException | ProductException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		
	}

}
