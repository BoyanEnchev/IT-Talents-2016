package users;

import destination.City;
import destination.Estate;
import exceptions.AccountException;
import exceptions.CityException;
import exceptions.EstateException;

public class Account extends User implements IAccount {

	private static final int MIN_PASSWORD_SIZE = 6;
	private static final int MIN_USERNAME_SIZE = 4;
	private String username;
	private String password;
	private String email;
	private String firstName;
	private String lastName;
	private String phoneNumber;

	public Account(String username, String password, String email, String firstName, String lastName)
			throws AccountException {
		if (username != null) {
			this.username = username;
		} else {
			throw new AccountException("Invalid username!");
		}
		if (password != null && isValidPassword(password) == true) {
			this.password = password;
		} else {
			throw new AccountException("Invalid password");
		}
		if (email != null && isValidEmail(email) == true) {
			this.email = email;
		} else {
			throw new AccountException("Invalid email!");
		}
		if (firstName != null) {
			this.firstName = firstName;
		} else {
			throw new AccountException("Invalid first name!");
		}
		if (lastName != null) {
			this.lastName = lastName;
		} else {
			throw new AccountException("Invalid last name!");
		}
	}

	private boolean isValidPassword(String password) {
		if (password.length() >= MIN_PASSWORD_SIZE && !password.matches("[^A-Z]+") && !password.matches("[^a-z]+")
				&& !password.matches("[^0-9]+")) {
			return true;
		}
		return false;
	}

	private boolean isValidEmail(String email) {
		// TODO Auto-generated method stub
		return false;
	}

	private boolean isValidUsername(String username) {

		if (username.length() >= MIN_USERNAME_SIZE && username.matches("[A-Za-z0-9]+")) {
			return true;
		}
		return false;
	}

	private boolean isValidName(String name) {
		if (name != null && name.matches("[A-Za-z]+")) {
			return true;
		}
		return false;
	}

	private boolean isValidPhoneNumber(String phone) {
		if (phone != null && phone.matches("[0]+[8]+[7-9]{1}[0-9]{7}"))
			return true;
		else
			return false;
	}

	@Override
	public void addDestination(String address, City city, byte stars) throws EstateException, CityException {

		Estate dest = new Estate(address, city, (byte) stars);

		// check if dest contains in city TO-DO

		// check if dest contains in city TO-DO
		if (dest != null) {
			city.addEstate(dest);

		}

	}

	@Override
	public void createRoom() {
		// TODO Auto-generated method stub
		
	}
	

}
