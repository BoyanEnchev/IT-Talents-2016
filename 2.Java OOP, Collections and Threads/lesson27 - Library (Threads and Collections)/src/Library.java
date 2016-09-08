

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import exceptions.LibraryException;

public class Library {
	
	private static final String[] productTypes = {"book", "magazine", "textbook"};
	private static final String[] bookGenres = {"thriler", "drama", "roman"};
	private static final String[] magazineCateg = {"sport", "fashion", "design", "cars"};
	private static final String[] textbookThemes = {"math", "chemistry", "english"};
	
	private Map<String, HashMap<String, TreeSet<Product>>> catalog = new HashMap<>();
	
	public Library(){
		generateProducts();
	}
	
	public void printCatalog(){
		Set<String> types = catalog.keySet();
		
		for(String type : types){
			System.out.println("Product type: " + type);
			
			HashMap<String, TreeSet<Product>> products = catalog.get(type);
			
			products.forEach((category, productSet) -> productSet.forEach(product -> System.out.println(product.toString())));
		}
	}
	
	public void addProduct(Product product, String type, String category) throws LibraryException{
		if(catalog.containsKey(type)){
			if(catalog.get(type).containsKey(category)){
				catalog.get(type).get(category).add(product);
				System.out.println("Product " + product.getTitle() + " from " + product.getPublishDate() + " year is added in catalog!");
			}else
				throw new LibraryException("This " + category + " doesn`t exist in library");
		}
		else
			throw new LibraryException("This " + type + " doesn`t exist in library");
	}
	
	private void generateProducts(){
		
		HashMap<String, TreeSet<Product>> booksMap = new HashMap<>();
		for(String genre : bookGenres){
			
			TreeSet<Product> books = new TreeSet<Product>();
			booksMap.put(genre, books);
		}
		catalog.put("book", booksMap);
		
		HashMap<String, TreeSet<Product>> magazinesMap = new HashMap<>();
		for(String category : magazineCateg){
			
			TreeSet<Product> magazines = new TreeSet<Product>();
			magazinesMap.put(category, magazines);
		}
		catalog.put("magazine", magazinesMap);
		
		HashMap<String, TreeSet<Product>> textbooksMap = new HashMap<>();
		for(String theme : textbookThemes){
			
			TreeSet<Product> textbooks = new TreeSet<Product>();
			textbooksMap.put(theme, textbooks);
		}
		catalog.put("textbook", textbooksMap);
	}
}
