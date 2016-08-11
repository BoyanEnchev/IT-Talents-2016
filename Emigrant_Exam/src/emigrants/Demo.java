package emigrants;

import java.util.Random;

import cities.City;
import cities.Country;
import cities.FBI;
import cities.SWAT;

public class Demo {
	
	private static final int NUM_POLICEMAN_IN_CITY = 5;
	private static final int MIN_CITIZENS_CAPACITY = 1000;
	private static final int MAX_CITIZENS_CAPACITY = 100000;
	private static final int NUM_OF_CITIES = 5;
	
	private final static String[] cityNames = {"Sofia", "Vraca", "Plovdiv", "Burgas", "Etropole"};
	private final static String[] emigrantsNames = {"Halil", "Mustafa", "Ismail", "Tarkan", "Yusuf"};
	private final static String[] policeNames = {"Stalone", "Lundgren", "VanDame", "Arnold", "Statham"};
	
	
	
	public static void main(String[] args) {
		
		try {
			
			Country bg = new Country("Bulgaria");
			Random rand = new Random();
			
			// 1. && 2. && 4. done!
			for (int index = 0; index < NUM_OF_CITIES; index++) {
				
				City tempCity = new City(cityNames[rand.nextInt(cityNames.length)], rand.nextInt(MAX_CITIZENS_CAPACITY) + MIN_CITIZENS_CAPACITY);
				
				// adding policemen
				for (int index1 = 0; index1 < NUM_POLICEMAN_IN_CITY; index1++) {
					
					switch(rand.nextInt(2)){
					case 0: tempCity.addPolice(new FBI(policeNames[rand.nextInt(policeNames.length)], tempCity, bg)); break;
					case 1: tempCity.addPolice(new SWAT(policeNames[rand.nextInt(policeNames.length)], tempCity, bg)); break;
					}
				}
				
				//adding emigrants
				for (int index2 = 0; index2 < 10; index2++) {
					
					int chance = rand.nextInt(100)+1;
					if(chance <= 25){
						tempCity.addEmigrant(new Radical(rand.nextInt(5000) + 500, tempCity, bg, new Passport(emigrantsNames[rand.nextInt(emigrantsNames.length)])));
					}else{
						if(chance <=60){
							tempCity.addEmigrant(new Extremist(rand.nextInt(5000) + 500, tempCity, bg));
						}else{
							tempCity.addEmigrant(new Normal(rand.nextInt(5000) + 500, tempCity, bg, new Passport(emigrantsNames[rand.nextInt(emigrantsNames.length)])));
						}
					}
					
				}
				
				//adding city
				bg.addCity(tempCity);
				
			}
			
			bg.printCities();
		
			
			
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}

}
