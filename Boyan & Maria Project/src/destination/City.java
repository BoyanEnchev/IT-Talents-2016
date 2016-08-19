package destination;

import java.util.HashSet;
import java.util.Set;

import exceptions.CityException;
import exceptions.LocationException;

public class City extends Location {

	Set<Estate> estates = new HashSet<Estate>();			//??????????????
	
	public City(String name) throws LocationException {
		super(name);
	}
	
	public void addEstate(Estate estate) throws CityException{
		if(estate != null){
			estates.add(estate);
		}else{
			throw new CityException("Invalid destitination in the city!");
		}
	}

	public String getName() {
		return super.getName();
	}

}
