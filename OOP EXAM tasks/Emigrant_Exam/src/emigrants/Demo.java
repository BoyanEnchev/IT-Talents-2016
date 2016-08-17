package emigrants;

import java.util.Random;
import java.util.Stack;

import javax.swing.border.EtchedBorder;

import cities.City;
import cities.Country;
import cities.FBI;
import cities.SWAT;
import weapons.Automath;
import weapons.Bomb;
import weapons.Pistol;
import weapons.Weapon;

public class Demo {
	
	private static final int SIZE_WEAPONS = 200;
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
			//bg.printCities();
			System.out.println("\n\n");
			
			// 3.
			Stack<Weapon> weapons = new Stack<Weapon>();
			for (int index = 0; index < SIZE_WEAPONS; index++) {
				switch(rand.nextInt(3)){
				case 0: weapons.add(new Automath(rand.nextInt(1000) + 500));
				case 1: weapons.add(new Pistol(rand.nextInt(500) + 500));
				case 2: weapons.add(new Bomb(rand.nextInt(2000) + 500));
				}
			}
		
			System.out.println("Emigrants who leave the city, because they don`t have enough money to buy a weapon :\n");
			
			for (int index = 0; index < bg.getCitiesSize(); index++) {
				City city = bg.getCity(index);

				for (int index2 = 0; index2 < city.getEmigrantsSize(); index2++) {
					Emigrant emigrant = city.getEmigrant(index2);

					if (emigrant instanceof Radical) {
						for (int indexRadical = 0; indexRadical < 5; indexRadical++) {
							if(!((Radical) emigrant).buyWeapon(weapons.pop()))
								break;
						}
					}
					if (emigrant instanceof Extremist) {
						for (int indexExtremist = 0; indexExtremist < 5; indexExtremist++) {
							if(!((Extremist) emigrant).buyWeapon(weapons.pop()))
								break;
						}
					}
				}

			}
			
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}

}
