package postoffice;

import java.util.ArrayList;
import java.util.Random;

import exceptions.PersonException;

public class Demo {

	public static void main(String[] args) {

		PostOffice poshta = new PostOffice();

		try {
			poshta.startWork();

			for (int count = 0; count < 10; count++) {

				String firstname = Person.firstNames[new Random().nextInt(Person.firstNames.length)];
				String lastname = Person.lastNames[new Random().nextInt(Person.lastNames.length)];
				String address = Person.addresses[new Random().nextInt(Person.addresses.length)];

				new Thread(new Citizen(firstname, lastname, address, poshta)).start();
				
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
			
			
			
			
		} catch (PersonException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
