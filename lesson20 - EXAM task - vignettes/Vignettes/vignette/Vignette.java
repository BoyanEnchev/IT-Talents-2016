package vignette;

public abstract class Vignette implements IVignette {

		
	private VignettePeriod period;
	protected short price;
	
	Vignette(VignettePeriod period, short price){
		this.period = period;
		setPrice(period, price);
	}
	
	@Override
	public void setPrice(VignettePeriod period, short price) {
	
		switch(period.ordinal()){
		case 0: this.price = price; break;
		case 1: this.price = IVignette.calculateMonthPrice(price); break;
		case 2: this.price = IVignette.calculateYearPrice(price); break;
		}
	}
	
	@Override
	public short getPrice() {
		return this.price;
	}

	public VignettePeriod getPeriod() {
		return period;
	}

	
	
}
