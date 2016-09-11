package vignette;

import java.time.Period;

public class TruckVignette extends Vignette {

	
	private static final byte DAY_PRICE = 7;
	private static final String COLOUR = "yellow";

	public TruckVignette(VignettePeriod period) {
		super(period, (short)DAY_PRICE);
		// TODO Auto-generated constructor stub
	}

	
	@Override
	public byte stick() {
		return 10;
	}


	@Override
	public String getColour() {
		return COLOUR;
	}
}
