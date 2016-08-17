package tradePlaces;

public class MallShop  extends TradePlace{
	
	private static final short YEAR_TAX = 150;

	public MallShop(String address, byte workTime, float area) throws TradePlaceException {
		super(address, workTime, area, YEAR_TAX);
	}

	public MallShop() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void setArea(float area) throws TradePlaceException {
		
		if(area < 10 || area > 100){
			throw new TradePlaceException("Nevalidna area na MallShop-a !");
		}
		this.area = area;
	}

}
