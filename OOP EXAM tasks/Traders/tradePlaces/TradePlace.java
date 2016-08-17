package tradePlaces;

import java.awt.List;
import java.util.ArrayList;

import interfaces.ITradePlace;
import traders.Product;

public abstract class TradePlace implements ITradePlace {
	
	private String address;
	private byte workTime;
	protected float area;
	private short tax;
	private ArrayList<Product> products = new ArrayList<Product>();
	
	public TradePlace() {
	}
	
	public TradePlace(String address, byte workTime, float area, short tax) throws TradePlaceException {
		super();
		if(workTime < 0 || workTime > 24 || address == null || address == ""){
			throw new TradePlaceException("Nevaliden TradePlace!");
		}
		this.address = address;
		this.workTime = workTime;
		setArea(area);
		this.tax = tax;
	}


	public float getArea() {
		return area;
	}


	public ArrayList<Product> getProducts() {
		return products;
	}


	public short getTax() {
		return tax;
	}

	
}
