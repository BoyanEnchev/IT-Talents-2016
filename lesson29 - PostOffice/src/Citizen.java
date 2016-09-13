package postoffice;

import java.util.Random;

import exceptions.PersonException;

public class Citizen extends Person implements Runnable{
	
	private static final double COEF_WHERE_TO_POST = 0.5;
	private static final int NUM_CITIZEN_POSTOBJECTS = 20;
	
	private String address;
	PostOffice postoffice;

	public Citizen(String firstname, String lastname, String address, PostOffice postoffice) throws PersonException {
		super(firstname, lastname);
		// TODO Auto-generated constructor stub
		//TODO validation
		
		if(address != null && postoffice != null){
			this.address = address;
			this.postoffice = postoffice;
		}
	}

	@Override
	public void run() {
		Random rand = new Random();
		
		for (int count = 0; count < NUM_CITIZEN_POSTOBJECTS; count++) {
			synchronized (postoffice) {
				if(Math.random() > COEF_WHERE_TO_POST){
					int choice = rand.nextInt(2);
					switch(choice){
					case 0: postoffice.post(new Letter(this));
					case 1: postoffice.post(new Parcel(this,rand.nextInt(60) + 20, rand.nextInt(60) + 20, rand.nextInt(60) + 20, rand.nextBoolean())); 
					}
				}else{
					postoffice.postInBox(new Letter(this));
				}
			}
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}

	public String getAddress() {
		return address;
	}
	
	

}
//String firstname = Person.firstNames[rand.nextInt(Person.firstNames.length)];
//String lastname = Person.lastNames[rand.nextInt(Person.lastNames.length)];
//String address = Person.addresses[rand.nextInt(Person.addresses.length)];
