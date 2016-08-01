package traders;

public class Product {

	private String name;
	private float price;
	
	public Product(String name, float price) throws ProductException {
		if(name == null || name == "" || price < 0){
			throw new ProductException("Nevaliden product, be pichaga! ");
		}
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public float getPrice() {
		return price;
	}
	
}
