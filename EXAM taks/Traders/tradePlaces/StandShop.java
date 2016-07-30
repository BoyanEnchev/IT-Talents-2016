package tradePlaces;

public class StandShop  extends TradePlace{
	
	private static final short YEAR_TAX = 50;

	public StandShop(String address, byte workTime, float area) throws TradePlaceException {
		super(address, workTime, area, YEAR_TAX);
	}

	@Override
	public void setArea(float area) throws TradePlaceException {
		
		if(area < 2 || area > 10){
			throw new TradePlaceException("Nevalidna area na StandShop!");
		}
		this.area = area;
	}
	
}
