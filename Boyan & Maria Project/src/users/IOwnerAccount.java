package users;

import java.util.ArrayList;

import destination.City;
import destination.Estate;
import destination.Room;
import exceptions.CityException;
import exceptions.EstateException;
import exceptions.RoomException;

public interface IOwnerAccount {
	
	void addEstate(String address, City city, byte stars) throws EstateException, CityException;
	
	void createRooms(Estate estate, int adults, int children, int numRooms, int priceForNight) throws RoomException;
}

