package emigrants;

import java.util.List;

import cities.City;
import cities.Country;
import exceptions.EmigrantException;


public abstract class Emigrant implements IEmigrant{

	private int money;
	private City currCity;
	private Country currCountry;
	private List<Emigrant> relatives;
	
	Emigrant(int money, City currCity, Country currCountry) throws EmigrantException{
		if(money >= 0){
			this.money = money;
		}else{
			throw new EmigrantException("The emigrant cannot have negative money!");
		}
		
		if(currCity != null || currCountry != null){
			this.currCity = currCity;
			this.currCountry = currCountry;
		}else{
			throw new EmigrantException("Invalid location!");
		}
	}
	
	public void addRelative(Emigrant emigrant) throws EmigrantException{
		
		if(emigrant != null && !this.relatives.contains(emigrant)){
			relatives.add(emigrant);
		}else{
			throw new EmigrantException("Invalid emigrant to be relative! ");
		}
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) throws EmigrantException {
		if(money >= 0)
			this.money = money;
		else
			throw new EmigrantException("Invalid set money!");
	}

	public City getCurrCity() {
		return currCity;
	}

	public void setCurrCity(City currCity) {
		this.currCity = currCity;
	}
	
	public int getRelativeSize(){
		return this.relatives.size();
	}

	@Override
	public String toString() {
		return "Emigrant [money=" + money + ", " + currCity + "] ";
	}
	
}
