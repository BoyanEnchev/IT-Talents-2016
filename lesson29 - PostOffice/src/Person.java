package postoffice;

import exceptions.PersonException;

public class Person {
	
	public static final String[] firstNames = {"Pesho", "Gosho","Kiro", "Armqn", "Vasko","Bobi"};
	public static final String[] lastNames = {"PEtrov", "Georgiev","Kirov", "Armqnov", "Vasilev","Bojivdarov"};
	public static final String[] addresses = {"Sofia", "London","Moskova", "Rim", "Paris","Vraca"};
	
	private String firstname;
	private String lastname;
	
	public Person(String firstname, String lastname) throws PersonException{
		if(firstname != null && lastname != null){
			this.firstname = firstname;
			this.lastname = lastname;
		}
		else
			throw new PersonException("Invalid person name!");
	}

	public String getFirstname() {
		return firstname;
	}

	public String getLastname() {
		return lastname;
	}

}
