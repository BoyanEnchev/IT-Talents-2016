package tradePlaces;

public class StreetShop extends TradePlace{

	private static final short YEAR_TAX = 50;
	
	public StreetShop(String address, byte workTime, float area) throws TradePlaceException {
		super(address, workTime, area, YEAR_TAX);
	}

	@Override
	public void setArea(float area) throws TradePlaceException {
		
		if(area < 4 || area > 6){
			throw new TradePlaceException("Nevalidna area na StreetShop-a !");
		}
		this.area = area;
	}

}
