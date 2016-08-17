package cities;

import emigrants.Emigrant;
import emigrants.Normal;
import exceptions.PoliceException;

public class SWAT extends Police {

	public SWAT(String name, City currCity, Country currCountry) throws PoliceException {
		super(name, currCity, currCountry);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean catchEmigrant(Emigrant emigrant) {

		if (Math.random() <= 0.9) {
			return true;
		}
		return false;
	}

}
