package vignette;

import java.time.Period;

public class CarVignette extends Vignette {

	
	private static final byte DAY_PRICE = 5;
	public static final String COLOUR = "blue";

	public CarVignette(VignettePeriod period) {
		super(period, (short)DAY_PRICE);
		// TODO Auto-generated constructor stub
	}

	@Override
	public byte stick() {
		return 5;
	}

	@Override
	public String getColour() {
		return COLOUR;
	}
}
