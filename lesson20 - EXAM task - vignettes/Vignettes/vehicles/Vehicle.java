package vehicles;

import vignette.BusVignette;
import vignette.CarVignette;
import vignette.TruckVignette;
import vignette.Vignette;

public abstract class Vehicle {

	private String model;
	protected Vignette vignette;
	short year;
	
	
	
	void setVignette(Vignette vignette) throws VehicleException{
		if(this.getClass().equals(Car.class) && vignette.getClass().equals(CarVignette.class))
			this.vignette = vignette;
		else
			throw new VehicleException("I'm car. This is wrong vignette!");
		
		if(this.getClass().equals(Truck.class) && vignette.getClass().equals(TruckVignette.class))
			this.vignette = vignette;
		else
			throw new VehicleException("I'm truck. This is wrong vignette!");
		
		if(this.getClass().equals(Bus.class) && vignette.getClass().equals(BusVignette.class))
			this.vignette = vignette;
		else
			throw new VehicleException("I'm bus. This is wrong vignette!");
	}



	public Vignette getVignette() {
		return vignette;
	}
}
