package emigrants;

import exceptions.EmigrantException;

public interface IEmigrant {

	void addRelative(Emigrant emigrant) throws EmigrantException;
}
