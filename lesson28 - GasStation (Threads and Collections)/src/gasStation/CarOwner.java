package gasStation;

import exceptions.CarOwnerException;

public class CarOwner implements Runnable {

	private String name;
	private String car;
	private GasStation station;
	private int columnNum;
	private boolean isReady = false;

	public CarOwner(String name, String car, GasStation station) throws CarOwnerException {
		if (name != null && car != null && station != null) {
			this.name = name;
			this.car = car;
			this.station = station;
		} else
			throw new CarOwnerException("Invalid name, car or station!");
	}

	@Override
	public void run() {

		Column column = station.getRandomColumn();
		this.columnNum = column.getNumber();
		CashDesk cashdesk = station.getRandomCashDesk();

		try {
			System.out.println("OWNER: " + this.toString() + " Spiram da zarejdam na " + column.toString());

			column.addCarOwner(this);
			// cashdesk.addClient(this);
			synchronized (station) {
				station.notify();
			}

			synchronized (this) {
				while (!this.isReady) {
					this.wait();
				}
				if (isReady) {
					notifyAll();
				}
			}

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public String toString() {
		return "[" + name + ", " + car + "]";
	}

	public int getColumn() {
		// TODO Auto-generated method stub
		return this.columnNum;
	}

	public void setReady(boolean isReady) {
		this.isReady = isReady;
	}

}
