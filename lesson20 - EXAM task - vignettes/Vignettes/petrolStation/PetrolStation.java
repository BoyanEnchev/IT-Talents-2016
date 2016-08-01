package petrolStation;

import java.awt.List;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Map.Entry;
import java.util.Random;

import vehicles.Vehicle;
import vignette.BusVignette;
import vignette.CarVignette;
import vignette.TruckVignette;
import vignette.Vignette;
import vignette.VignettePeriod;

public class PetrolStation implements IPetrolStation {

	private float oborot;
	private LinkedList<Vignette> vignettes = new LinkedList<Vignette>();

	@Override
	public void generateVignettes() {
		Random r = new Random();
	
		for (int index = 0; index < 10000; index++) {
			Vignette tempVignette = null;
			int indexPeriod = r.nextInt(3);
			int vignetteType = r.nextInt(3);
			
			switch(vignetteType){
			case 0: tempVignette = new CarVignette(VignettePeriod.values()[indexPeriod]); break;
 			case 1: tempVignette = new BusVignette(VignettePeriod.values()[indexPeriod]); break;
			case 2: tempVignette = new TruckVignette(VignettePeriod.values()[indexPeriod]); break;
			}
			
			vignettes.add(tempVignette);
		}
			
	}

	@Override
	public Vignette sellVignette(Vehicle vehicle, VignettePeriod period) {
		
		for(Vignette v : this.vignettes){
			if(v.getClass().equals(vehicle.getVignette().getClass()) && v.getPeriod().equals(period)){
				Vignette temp = v;
				this.vignettes.remove(v);
				return temp;
			}
		}
		return null;
	}

	@Override
	public void printVignettes() {
		int count = 0;
		for (Vignette v : this.vignettes) {
			count++;
			System.out.println(count + ". price: " + v.getPrice() + " / period: " + v.getPeriod().name() + " / colour: " + v.getColour());
		}
	}

	public LinkedList<Vignette> getVignettes() {
		return vignettes;
	}

}
