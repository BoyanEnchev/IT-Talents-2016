package petrolStation;
import java.util.ArrayList;
import java.util.List;

import vehicles.Vehicle;
import vignette.Vignette;
import vignette.VignettePeriod;

public class Driver implements IDriver{

	private String name;
	private List<Vehicle> vehicles= new ArrayList<Vehicle>();
	private int money;
	IPetrolStation petrolSt;

	public Driver(String name, int money, PetrolStation petrolSt) throws DriverEcxeption {
		if(name != null && name != " " && money >= 0 && petrolSt != null){
			this.name = name;
			this.money = money;
			this.petrolSt = petrolSt;
		}
		else{
			throw new DriverEcxeption("Nevaliden Driver mi podavash be pich!");
		}
	}
	
	
	@Override
	public void buyAllVignette() {
		
		
	}
	@Override
	public void buyVignette(int index, VignettePeriod period) {
			
		Vignette vignette = this.petrolSt.sellVignette(vehicles.get(index), period);
		
		//if(vignette != null)
			//this.vehicles.get(index)
	}
	@Override
	public void printInvalidVignette() {
		// TODO Auto-generated method stub
		
	}


	public String getName() {
		return name;
	}


	public int getMoney() {
		return money;
	}


	public List<Vehicle> getVehicles() {
		return vehicles;
	}

}
