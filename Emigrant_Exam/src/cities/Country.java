package cities;

import java.util.ArrayList;
import java.util.List;

import exceptions.CountyException;

public class Country {

	private String name;
	private List<City> cities = new ArrayList<City>();
	
	
	public Country(String name) throws CountyException {
		if(name != null)
			this.name = name;
		else
			throw new CountyException("Invalid country name!");
	}

	public void addCity(City city) throws CountyException{
		if(city != null){
			this.cities.add(city);
		}
		else{
			throw new CountyException("Invalid city to add in the country!");
		}
	}
	
	
	public void printCities(){
		for(City city : this.cities){
			System.out.println(city.toString());
			System.out.println("Emigrants:");
			city.printEmigrants();
			System.out.println("Policemen:");
			city.printPolice();
			System.out.println("------------------------------------------------------------");
		}
	}

}
