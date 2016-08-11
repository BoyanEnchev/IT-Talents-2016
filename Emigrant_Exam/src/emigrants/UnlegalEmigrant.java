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
	public boolean buyWeapon(Weapon weapon) throws EmigrantException, CityException{
		
		if (this.getMoney() >= weapon.getPrice()) {
			payMoneyForWeapon(weapon.getPrice());
			this.weapons.add(weapon);
			return true;
		} else {
			System.out.println(this.toString() + "hasn`t enough money and he EXIT the city!");
			//this.getCurrCity().removeEmigrant(this);
			this.setCurrCity(new City("Pernik",25000));
			return false;
		}
	}

	public void payMoneyForWeapon(int price) throws EmigrantException{
		this.setMoney(this.getMoney() - price);
	}
	
	public int getSizeWeapons(){
		return this.weapons.size();
	}
}
