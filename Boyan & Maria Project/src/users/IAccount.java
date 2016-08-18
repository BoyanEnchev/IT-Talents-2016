package users;

import destination.City;
import exceptions.CityException;
import exceptions.EstateException;

public interface IAccount {
	
	void addDestination(String address, City city, byte stars) throws EstateException, CityException;
	void createRoom();
}

