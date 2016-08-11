package emigrants;

import cities.City;
import cities.Country;
import exceptions.EmigrantException;

public class Normal extends Emigrant {

	private Passport passport;

	Normal(int money, City currCity, Country currCountry, Passport passport) throws EmigrantException {
		super(money, currCity, currCountry);
		if (passport != null) {
			this.passport = passport;
		}
	}

	@Override
	public void addRelative(Emigrant emigrant) throws EmigrantException {

		if(getRelativeSize() <= 10){
			super.addRelative(emigrant);
		}else{
			System.out.println("The relatives of Normal Emigrants should be smaller than 10!");
		}
	}

}
