package vignette;

import java.time.Period;

public class BusVignette extends Vignette {

	private static final byte DAY_PRICE = 9;
	private static final String COLOUR = "green";

	public BusVignette(VignettePeriod period) {
		super(period, (short)DAY_PRICE);
		// TODO Auto-generated constructor stub
	}

	
	@Override
	public byte stick() {
		return 20;
	}


	@Override
	public String getColour() {
		return COLOUR;
	}

}
