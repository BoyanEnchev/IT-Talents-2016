package emigrants;

import java.util.HashSet;
import java.util.Set;
import cities.City;
import cities.Country;
import exceptions.EmigrantException;
import weapons.Bomb;
import weapons.Weapon;

public class Extremist extends UnlegalEmigrant {

	private Set<Weapon> weapons = new HashSet<Weapon>();
	
	Extremist(int money, City currCity, Country currCountry) throws EmigrantException {
		super(money, currCity, currCountry);
	}

	
	public boolean hasBomb(){
		for(Weapon w : this.weapons){
			if(w instanceof Bomb) return true;
		}
		return false;
	}
	
}
