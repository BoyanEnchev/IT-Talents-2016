package petrolStation;

import vehicles.Vehicle;
import vignette.Vignette;
import vignette.VignettePeriod;

public interface IPetrolStation {

	void generateVignettes();

	Vignette sellVignette(Vehicle vehicle, VignettePeriod period);
	
	void printVignettes();

}