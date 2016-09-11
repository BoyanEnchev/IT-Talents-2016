package gasStation;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Column {
	
	private static int count = 0;
	
	private BlockingQueue<CarOwner> waitingCars = new ArrayBlockingQueue<>(3);
	private int number;
	
	
	public Column() {
		this.number = count;
		Column.count++;
	}


	public void addCarOwner(CarOwner carOwner) throws InterruptedException {
		//TO-DO validaciq
		this.waitingCars.put(carOwner);
	}


	public boolean isEmpty() {
		return waitingCars.isEmpty();
	}



	public CarOwner refuelCar() throws InterruptedException {
		CarOwner owner = waitingCars.take();
		System.out.println("Automobile: " + owner.toString() + " fuel his har");
		return owner;
	}
	

	public int getNumber() {
		// TODO Auto-generated method stub
		return number;
	}


	@Override
	public String toString() {
		return this.number + " Column [waitingCars=" + waitingCars + "]";
	}


}
