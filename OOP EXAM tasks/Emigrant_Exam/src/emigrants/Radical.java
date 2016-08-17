package emigrants;

import cities.City;
import cities.Country;
import exceptions.CityException;
import exceptions.EmigrantException;
import weapons.Bomb;
import weapons.Weapon;

public class Radical extends UnlegalEmigrant {

	private Passport passport;
	

	public Radical(int money, City currCity, Country currCountry, Passport passport) throws EmigrantException {
		super(money, currCity, currCountry);
		if (passport != null) {
			if (Math.random() <= 0.35) {
				this.passport = passport;
			}
		}
	}
	
	@Override
	public boolean buyWeapon(Weapon weapon) throws EmigrantException, CityException{
		if(getSizeWeapons() <= 5 && !(weapon instanceof Bomb)){
			super.buyWeapon(weapon);
			return true;
		}
		return false;
	}
	


	public boolean havePassport() {
		if (this.passport != null)
			return true;
		else
			return false;
	}

}
