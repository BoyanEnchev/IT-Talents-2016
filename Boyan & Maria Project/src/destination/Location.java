package destination;

import exceptions.LocationException;

public abstract class Location {
	private String name;
	
	public Location(String name) throws LocationException{
		if(name != null){
			this.name = name;
		}else{
			throw new LocationException("Invalid name!");
		}
	}
}
