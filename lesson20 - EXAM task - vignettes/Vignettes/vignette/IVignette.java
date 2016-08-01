package vignette;

import java.time.Period;

public interface IVignette {

	byte YEARLY_COEF = 6;
	byte MONTLY_COEF = 10;
	byte DAYS_OF_WEEK = 7;
	
	public static short calculateMonthPrice(float price){
		return (short) (price * DAYS_OF_WEEK * MONTLY_COEF);
	}
	public static short calculateYearPrice(float dayPrice){
		return (short) (dayPrice * DAYS_OF_WEEK * MONTLY_COEF * YEARLY_COEF);
	}
	
	byte stick();
	short getPrice();
	void setPrice(VignettePeriod period, short price);
	String getColour();
	
}
