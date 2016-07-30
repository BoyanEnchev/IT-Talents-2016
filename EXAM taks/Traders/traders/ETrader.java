package traders;

import java.util.ArrayList;

import deliverers.Deliverer;
import deliverers.SmallDeliverer;
import tradePlaces.MallShop;
import tradePlaces.TradePlace;

public class ETrader extends Trader implements ITrader{

	private static final int MAX_SIZE_TRADE_PLACES = 1;
	private static final int MAX_SIZE_DELIVERERS = 5;

	public ETrader(String name, int capital) {
		super(name, capital);
		this.tradePlaces = new ArrayList<TradePlace>(MAX_SIZE_TRADE_PLACES);
		this.deliverers = new ArrayList<Deliverer>(MAX_SIZE_DELIVERERS);
	}

	@Override
	public void addTradePlace(TradePlace tradePlace) throws TraderException {
	
		if(tradePlaces.size() > MAX_SIZE_TRADE_PLACES){
			throw new TraderException("Obektite vurhu, koito raboti Amb.tyrgovec sa <= 20!");
		}else{
			if(tradePlace != null && !(tradePlace instanceof MallShop)) //ne moje da bude obekt ot MallShop
				this.tradePlaces.add(tradePlace);
			else
				throw new TraderException("Kakuv e toq invalid tradePlaces be priqtel?");
		}
	}

	@Override
	public void addDeliverer(Deliverer deliverer) throws TraderException {
		
		if(this.deliverers.size() > MAX_SIZE_DELIVERERS){
			throw new TraderException("ET raboti samo s max 5 dostavchici!");
		}else{
			if(deliverer != null && (deliverer instanceof SmallDeliverer))
				this.deliverers.add(deliverer);
			else
				throw new TraderException("Kakuv e toq nevaliden deliverer be?");
		}
		
	}

	


}
