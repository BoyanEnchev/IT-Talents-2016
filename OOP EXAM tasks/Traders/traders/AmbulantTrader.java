package traders;

import java.util.ArrayList;

import deliverers.Deliverer;
import deliverers.SmallDeliverer;
import tradePlaces.TradePlace;

public class AmbulantTrader extends Trader{
	

	private static final int MAX_SIZE_TRADE_PLACES = 20;
	private static final int MAX_SIZE_DELIVERERS = 1;

	public AmbulantTrader(String name,int capital) {
		super(name, capital);
		this.tradePlaces = new ArrayList<TradePlace>(MAX_SIZE_TRADE_PLACES);
		this.deliverers = new ArrayList<Deliverer>(MAX_SIZE_DELIVERERS);
	}

	@Override
	public void addTradePlace(TradePlace tradePlace) throws TraderException {
	
		if(tradePlaces.size() > MAX_SIZE_TRADE_PLACES){
			throw new TraderException("Obektite vurhu, koito raboti Amb.tyrgovec sa <= 20!");
		}else{
			if(tradePlace != null)
				this.tradePlaces.add(tradePlace);
			else
				throw new TraderException("Kakuv e toq null tradePlaces be priqtel?");
		}
	}

	@Override
	public void addDeliverer(Deliverer deliverer) throws TraderException {
		
		if(this.deliverers.size() >= MAX_SIZE_DELIVERERS){
			throw new TraderException("Ambulantiniq turgovec raboti samo s 1 dostavchik!");
		}else{
			if(deliverer != null && deliverer instanceof SmallDeliverer)
				this.deliverers.add(deliverer);
			else
				throw new TraderException("Kakuv e toq invalid deliverer be?");
		}
		
	}

	
	
	
}
