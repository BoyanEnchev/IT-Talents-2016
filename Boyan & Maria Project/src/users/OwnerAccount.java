package users;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import destination.City;
import destination.Estate;
import destination.Room;
import destination.RoomWithChildren;
import exceptions.AccountException;
import exceptions.CityException;
import exceptions.EstateException;
import exceptions.RoomException;

public class OwnerAccount extends Account implements IOwnerAccount {

	private Map<String, Estate> estates = new HashMap<String, Estate>();

	public OwnerAccount(String username, String password, String email, String firstName, String lastName)
			throws AccountException {
		super(username, password, email, firstName, lastName);
	}

	@Override
	public void addEstate(String address, City city, byte stars) throws EstateException, CityException {

		Estate estate = new Estate(address, city, (byte) stars);

		// check if dest contains in city TO-DO
		if (estate != null) {
			city.addEstate(estate);
			estates.put(address, estate);
		}

	}

	@Override
	public void createRooms(Estate estate, int adults, int children, int numRooms, int priceForNight)
			throws RoomException {
		List<Room> rooms;
		String type;

		if (children == 0) {
			rooms = new ArrayList<Room>();

			for (int number = 0; number < numRooms; number++) {
				Room room = new Room(priceForNight, (byte) adults , estate.getNumOfRooms());
				estate.addRoom(room.getType(), room);
			}

		}

	}
	
	public Estate getEstate(String address) throws EstateException{
		if(estates.containsKey(address))
				return estates.get(address);
		throw new EstateException(super.getFirstName() + " " + super.getLastName() + " have not estate with address: " + address);
	}
}
