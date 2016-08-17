package cities;

import exceptions.PoliceException;

public abstract class Police implements IPolice {
	
	private String name;
	private City CurrCity;
	private Country CurrCountry;
	

	public Police(String name, City currCity, Country currCountry) throws PoliceException {
		if(name != null || name.trim().length() >= 2)
			this.name = name;
		else
			throw new PoliceException("Invalid name of policeman");
		
		if(currCity != null && currCountry != null){
		CurrCity = currCity;
		CurrCountry = currCountry;
		}else{
			throw new PoliceException("Invalid location! Check country or city!");
		}
	}


	public String getName() {
		return name;
	}


	@Override
	public String toString() {
		return "Police [name=" + name + "]";
	}

	
}
