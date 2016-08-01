package petrolStation;

import vignette.VignettePeriod;

public interface IDriver {

	void buyAllVignette();
	void buyVignette(int index, VignettePeriod period);
	void printInvalidVignette();
}
