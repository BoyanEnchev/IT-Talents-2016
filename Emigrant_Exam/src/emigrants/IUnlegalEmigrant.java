package emigrants;

import exceptions.CityException;
import exceptions.EmigrantException;
import weapons.Weapon;

public interface IUnlegalEmigrant {

	void buyWeapon(Weapon weapon) throws EmigrantException, CityException;

}
