package interfaces;

import java.util.ArrayList;

import deliverers.Deliverer;
import tradePlaces.TradePlace;
import traders.Product;
import traders.TraderException;

public interface ITrader {

	void addTradePlace(TradePlace tradePlace) throws TraderException;

	void addDeliverer(Deliverer deliverer) throws TraderException;
	
	void makeOrder(Deliverer deliverer, ArrayList<Product> products);

	double collectProfit();
	
	public void payTaxes();
}