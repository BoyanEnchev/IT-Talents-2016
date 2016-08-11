package cities;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import emigrants.Emigrant;
import emigrants.Normal;
import emigrants.Radical;
import exceptions.CityException;
import exceptions.CountyException;

public class City {

	private String name;
	private List<Police> police = new ArrayList<Police>();
	private int numCitizens;
	private List<Emigrant> emigrants = new ArrayList<Emigrant>();

	public City(String name, int numCitizens) throws CityException {

		if (name != null)
			this.name = name;
		else
			throw new CityException("Invalid country name!");

		this.numCitizens = numCitizens;

	}

	public void addEmigrant(Emigrant emigrant) {

		if (emigrant != null) {

			if (emigrant instanceof Normal) {
				this.emigrants.add(emigrant);
			} else {
				if (emigrant instanceof Radical && ((Radical) emigrant).havePassport()) {
					this.emigrants.add(emigrant);
				} else {
					Random rand = new Random();

					int indexPoliceman = rand.nextInt(this.police.size());

					if (police.get(indexPoliceman).catchEmigrant(emigrant)) {
						System.out.println(	"I`m policeman " + police.get(indexPoliceman).getName() + " and I cought emigrantt");
					} else {
						System.out.println("Fuck...the emigrant enter in the city!");
						this.emigrants.add(emigrant);
					}
				}
			}
		}

	}
	
	public Emigrant getEmigrant(int index) throws CityException{
		if(index >= 0 && index < this.emigrants.size())
			return this.emigrants.get(index);
		else
			throw new CityException("Index is invalid!");
	}
	
	public int getEmigrantsSize(){
		return this.emigrants.size();
	}

	public void removeEmigrant(Emigrant emigrant) throws CityException {
		if (emigrant != null) {
			if (this.emigrants.contains(emigrant)) {
				emigrants.remove(emigrant);
			} else
				throw new CityException("Emigrant doesn't exist in list with emigrants!");
		} else {
			throw new CityException("Invalid emigrant!");
		}

	}

	public void addPolice(Police police) throws CityException {
		if (police != null)
			this.police.add(police);
		else {
			throw new CityException("Invalid policeman!");
		}
	}
	
	public void printEmigrants(){
		for(Emigrant emigrant : this.emigrants)
			System.out.println(emigrant.toString());
	}
	
	public void printPolice(){
		for(Police police : this.police)
			System.out.println(police);
	}

	@Override
	public String toString() {
		return "City [name=" + name + ", numCitizens=" + numCitizens + "]";
	}
}
