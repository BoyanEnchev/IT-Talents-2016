package petrolStation;

import java.util.Random;

import vehicles.Bus;
import vehicles.Car;
import vehicles.Truck;

public class Demo {

	public static void main(String[] args) {

		try {
			
			// 1.
			PetrolStation omv = new PetrolStation();
			Random r = new Random();

			//omv.generateVignettes();
			//omv.printVignettes();
			
			// 2.
			Driver[] drivers = new Driver[20];
			String[] names = {"Pesho", "Gosho", "Misho", "Ivan", "Petkan"};
			
			for (int index = 0; index < 20; index++) {
				drivers[index] = new Driver(names[r.nextInt(names.length)], r.nextInt(50000)+1, omv);
			}
			for(Driver d : drivers){
			System.out.println(d.getName() + " " + d.getMoney());
			}
			
			// 3.
			for(Driver driver : drivers){
				for (int index = 0; index < 10; index++) {
					switch(r.nextInt(3)){
					case 0: driver.getVehicles().add(new Car());
					case 1: driver.getVehicles().add(new Truck());
					case 2: driver.getVehicles().add(new Bus());
					}
				}
			}
			
			// 4.
			
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
	}

}
