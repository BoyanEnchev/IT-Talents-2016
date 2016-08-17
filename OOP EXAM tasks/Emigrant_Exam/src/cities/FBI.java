package cities;

import emigrants.Emigrant;
import emigrants.Extremist;
import emigrants.Radical;
import exceptions.PoliceException;

public class FBI extends Police {

	public FBI(String name, City currCity, Country currCountry) throws PoliceException {
		super(name, currCity, currCountry);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean catchEmigrant(Emigrant emigrant) {

		if (emigrant instanceof Extremist) {
			if (((Extremist) emigrant).hasBomb())
				return false;
			else {
				if (Math.random() > 0.5)
					return true;
				else
					return false;
			}
		}

		if (emigrant instanceof Radical) {
			if (Math.random() > 0.5)
				return true;
			else
				return false;
		}
		return false; 	// if emigrant is Normal return false
	}

}
