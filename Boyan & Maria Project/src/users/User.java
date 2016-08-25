package users;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import destination.Application;
import destination.City;
import destination.Country;
import destination.Estate;
import destination.Room;
import exceptions.ReservationException;
import exceptions.RoomException;


public abstract class User {

	public static List<ArrayList<Room>> search(Country country, City city, int startYear, int startMonth, int startDay,
					int endYear, int endMonth, int endDay,  int numAdults, int numChildren) throws RoomException, ReservationException{
		
		List<ArrayList<Room>> result = new ArrayList<ArrayList<Room>>();
		
		
		if(Application.locations.containsKey(country)){
			
			Map<String, City> cities = Application.locations.get(country);
			
			if(cities.containsKey(city.getName())){
			
				Map<String, Estate> estatesInCity = cities.get(city.getName()).getEstates();
				
				List<Estate> estates = new ArrayList<Estate>(estatesInCity.values());
				

				
				for (int i = 0; i < estates.size(); i++) {
					System.out.println(country.getName() + ", " + city.getName() + ", " + estates.get(i).getAddress() + ": " + 
				estates.get(i).getAvailableRooms(startYear, startMonth, startDay, endYear, endMonth, endDay, numAdults, numChildren));
					
					result.add(i, estates.get(i).getAvailableRooms(startYear, startMonth, startDay, endYear, endMonth, endDay, numAdults, numChildren));
				}
			}
		}
		
		return result;
		
		
	}

}
