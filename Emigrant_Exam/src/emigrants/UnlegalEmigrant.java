package emigrants;

import java.util.HashSet;
import java.util.Set;

import cities.City;
import cities.Country;
import exceptions.CityException;
import exceptions.EmigrantException;
import weapons.Weapon;

public abstract class UnlegalEmigrant extends Emigrant implements IUnlegalEmigrant{

	protected Set<Weapon> weapons = new HashSet<Weapon>();
	
	public UnlegalEmigrant(int money, City currCity, Country currCountry) throws EmigrantException {
		super(money, currCity, currCountry);
	}
	
	@Override
	public void buyWeapon(Weapon weapon) throws EmigrantException, CityException{
		
		if (this.getMoney() >= weapon.getPrice()) {
			payMoneyForWeapon(weapon.getPrice());
			this.weapons.add(weapon);
		} else {
			System.out.println("The emigrant hasn`t enough money to buy the weapon and he EXIT the city!");
			this.getCurrCity().removeEmigrant(this);
			this.setCurrCity(null);
		}
	}

	public void payMoneyForWeapon(int price) throws EmigrantException{
		this.setMoney(this.getMoney() - price);
	}
	
	public int getSizeWeapons(){
		return this.weapons.size();
	}
}
