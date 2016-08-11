package emigrants;

import java.util.HashSet;
import java.util.Set;

import cities.City;
import cities.Country;
import exceptions.CityException;
import exceptions.EmigrantException;
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
	public void buyWeapon(Weapon weapon) throws EmigrantException, CityException{
		if(getSizeWeapons() <= 5)
			super.buyWeapon(weapon);
		else{
			System.out.println("The Radical emigrant should have 5 weapons at the most!");
		}
	}
	


	public boolean havePassport() {
		if (this.passport != null)
			return true;
		else
			return false;
	}

}
