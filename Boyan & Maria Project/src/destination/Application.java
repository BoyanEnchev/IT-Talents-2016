package destination;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import exceptions.CoutryException;
import exceptions.LocationException;
import exceptions.RoomException;
import users.Account;
import users.OwnerAccount;
import users.User;

public class Application {

	public static Map<Country, Map<String, City>> locations = new HashMap<Country, Map<String, City>>();

	public static void main(String[] args) throws RoomException {

		Room room = new Room(50, (byte) 4, 1);

		try {

			room.addReservation(2016, 7, 8, 2016, 7, 15);
			room.addReservation(2016, 7, 15, 2016, 7, 25);
			room.addReservation(2016, 7, 23, 2016, 7, 28);
			room.addReservation(2016, 8, 8, 2016, 8, 25);
			room.addReservation(2017, 7, 8, 2017, 7, 15);
			room.addReservation(2016, 8, 5, 2016, 8, 26);

			System.out.println("----------------------------------------");

			room.printReservations();

			System.out.println("------------------------------------------\n");

			OwnerAccount maria = new OwnerAccount("mariika", "Mariika96", "mariika@abv.bg", "Maria", "Ninova");

			generateLocations();

			for (Entry<Country, Map<String, City>> entry : locations.entrySet()) {
				Country country = entry.getKey();
				System.out.println("\n" + country.toString());
				HashMap<String, City> cities = (HashMap<String, City>) entry.getValue();

				cities.forEach((name, city) -> System.out.println(city.toString()));
				// ...
			}

			Country bg = new Country("Bulgaria");

			City sofia = locations.get(bg).get("Sofia");

			OwnerAccount boyan = new OwnerAccount("Boyan1993", "Ronaldo7", "bo4ko_vr@abv.bg", "Boyan", "Enchev");

			boyan.addEstate("Sofia+Nishava+5", bg, locations.get(bg).get("Sofia"), (byte) 5);
			boyan.addEstate("Sofia+ZlatenRog+18", bg, locations.get(bg).get("Sofia"), (byte) 3);
			boyan.addEstate("Sofia+KrumPopov+22", bg, locations.get(bg).get("Sofia"), (byte) 4);

			boyan.createRooms(boyan.getEstate("Sofia+Nishava+5"), 2, 0, 3, 80);
			boyan.createRooms(boyan.getEstate("Sofia+ZlatenRog+18"), 2, 0, 2, 120);
			boyan.createRooms(boyan.getEstate("Sofia+KrumPopov+22"), 2, 0, 2, 200);

			Account vanio = new Account("vancyki97", "Vankata97", "vancyki_97@abv.bg", "Ivan", "Kolev");
			
			System.out.println("\nBefore reservation:\n");
			User.search(bg, sofia, 2016, 7, 20, 2016, 7, 25, 2, 0);
			
			
			boyan.getEstate("Sofia+Nishava+5").rooms.get("Double Room").get(0).addReservation(2016, 7, 15, 2016, 7, 21);
			boyan.getEstate("Sofia+ZlatenRog+18").rooms.get("Double Room").get(1).addReservation(2016, 7, 15, 2016, 7, 21);
			boyan.getEstate("Sofia+KrumPopov+22").rooms.get("Double Room").get(0).addReservation(2016, 7, 15, 2016, 7, 21);
			boyan.getEstate("Sofia+KrumPopov+22").rooms.get("Double Room").get(1).addReservation(2016, 7, 15, 2016, 7, 21);
			
			System.out.println("\nAfter reservation:\n");
			User.search(bg, sofia, 2016, 7, 20, 2016, 7, 25, 2, 0);
			
			//

		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}

	public static void generateLocations() throws LocationException, CoutryException {
		Country bulgaria = new Country("Bulgaria");
		Country spain = new Country("Spain");
		Country italy = new Country("Italy");

		Map<String, City> bgCities = new HashMap<String, City>();

		bgCities.put("Sofia", new City("Sofia"));
		bgCities.put("Varna", new City("Varna"));
		bgCities.put("Burgas", new City("Burgas"));
		locations.put(bulgaria, bgCities);

		Map<String, City> spCities = new HashMap<String, City>();
		spCities.put("Barcelona", new City("Barcelona"));
		spCities.put("Madrid", new City("Madrid"));
		spCities.put("Palma De Mallorka", new City("Palma De Mallorka"));
		locations.put(spain, spCities);

		Map<String, City> itCities = new HashMap<String, City>();
		itCities.put("Rome", new City("Rome"));
		itCities.put("Milano", new City("Milano"));
		itCities.put("Genoa", new City("Genoa"));
		locations.put(italy, itCities);

	}

}
