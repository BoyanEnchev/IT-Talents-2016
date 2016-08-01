package traders;

import java.util.ArrayList;
import java.util.List;

import deliverers.Deliverer;
import interfaces.ITrader;
import tradePlaces.TradePlace;

public abstract class Trader implements ITrader {

	
	
	private static final double TRADE_OVVERATE = 1.3;
	private String name;
	private String adress;
	private int capital;
	protected List<TradePlace> tradePlaces;
	protected List<Deliverer> deliverers;

	public Trader(String name, int capital) {
		this.name = name;
		this.adress = adress;
		this.capital = capital;
	}

	public void makeOrder(Deliverer deliverer, ArrayList<Product> products) {

		if (checkOrderPrice(products)) {

			if (this.deliverers.contains(deliverer)) {

				for (TradePlace tradePlace : this.tradePlaces) {

					for (Product product : products) {
						capital -= product.getPrice();
						tradePlace.getProducts().add(product);
					}
				}
			}
		}
	}

	private boolean checkOrderPrice(ArrayList<Product> products) {
		double orderPrice = 0;
		for (Product product : products) {
			orderPrice += product.getPrice();
		}
		return (orderPrice < (this.capital/2));
	}
	
	public double collectProfit(){
	
		double profit = 0;
		
		for(TradePlace tradePlace : this.tradePlaces){
			for(Product p : tradePlace.getProducts()){
				this.capital += p.getPrice();
				profit += p.getPrice();
			}
		}
		
		return (profit * TRADE_OVVERATE);
	}
	
	public void payTaxes(){
		for(TradePlace tradePlace : this.tradePlaces){
			capital -= tradePlace.getTax();
		}
	}
}
