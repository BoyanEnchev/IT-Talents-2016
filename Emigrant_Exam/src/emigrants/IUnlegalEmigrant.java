package emigrants;

import exceptions.CityException;
import exceptions.EmigrantException;
import weapons.Weapon;

public interface IUnlegalEmigrant {

	boolean buyWeapon(Weapon weapon) throws EmigrantException, CityException;

}
