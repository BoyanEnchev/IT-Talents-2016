package traders;

import java.util.ArrayList;

import deliverers.Deliverer;
import tradePlaces.StandShop;
import tradePlaces.TradePlace;

public class ChainTrader extends Trader implements ITrader{
	
	private static final int MAX_SIZE_TRADE_PLACES = 10;
	private static final int MAX_SIZE_DELIVERERS = 15;

	public ChainTrader(String name, int capital) {
		super(name, capital);
		this.tradePlaces = new ArrayList<TradePlace>(MAX_SIZE_TRADE_PLACES);
		this.deliverers = new ArrayList<Deliverer>(MAX_SIZE_DELIVERERS);
	}

	@Override
	public void addTradePlace(TradePlace tradePlace) throws TraderException {
	
		if(tradePlaces.size() > MAX_SIZE_TRADE_PLACES){
			throw new TraderException("Obektite vurhu, koito raboti turgovskata veriga sa <= 10!");
		}else{
			if(tradePlace != null && !(tradePlace instanceof StandShop))
				this.tradePlaces.add(tradePlace);
			else
				throw new TraderException("Kakuv e toq invalid tradePlaces be priqtel?");
		}
	}

	@Override
	public void addDeliverer(Deliverer deliverer) throws TraderException {
		
		if(this.deliverers.size() >= MAX_SIZE_DELIVERERS){
			throw new TraderException("Turgovskata veriga raboti s max 15 deliverers!");
		}else{
			if(deliverer != null)
				this.deliverers.add(deliverer);
			else
				throw new TraderException("Kakuv e toq null deliverer be?");
		}
		
	}


}
