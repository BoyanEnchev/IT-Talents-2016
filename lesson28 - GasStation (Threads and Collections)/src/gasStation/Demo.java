package gasStation;

import java.util.Random;

import exceptions.CarOwnerException;
import exceptions.WorkerException;

public class Demo {

	private static final String[] ownerNames = { "Kalin", "Ivan", "Joro", "Milena", "Ivo", "Mitka" };
	private static final String[] cars = { "Mercedes", "Scoda", "Renault", "BMW", "AUDI", "Lamborgini" };
	private static Random rand = new Random();

	public static void main(String[] args) {
		GasStation omv = new GasStation();

		try {
			Thread worker1 = new Thread(new Worker(omv));
			Thread worker2 = new Thread(new Worker(omv));
			worker1.setDaemon(true);
			worker2.setDaemon(true);
			
			
			CashDesk cashier1 = new CashDesk(omv);
			CashDesk cashier2 = new CashDesk(omv);
			omv.generateCashDesks(cashier1, cashier2);
			Thread c1 = new Thread(cashier1);
			Thread c2 = new Thread(cashier2);
			
			
			for (int i = 0; i < 10; i++) {
				String owner = ownerNames[rand.nextInt(ownerNames.length)];
				String car = cars[rand.nextInt(cars.length)];
				new Thread(new CarOwner(owner, car, omv)).start();
			}
			
			worker1.start();
			worker2.start();
			c1.start();
			c2.start();
			
			
			Thread.sleep(30000);
			cashier1.printPayments();
			

		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

}
