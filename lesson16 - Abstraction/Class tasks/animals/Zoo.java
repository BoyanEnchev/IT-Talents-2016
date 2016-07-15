package animals;

public class Zoo {

	Animal[] animals;
	int countAnimals;

	Zoo() {
		animals = new Animal[10];
	}

	public void addAnimal(Animal a) {
		if (countAnimals == 10) {
			Animal[] temp = new Animal[countAnimals * 2];
			for (int index = 0; index < temp.length; index++) {
				temp[index] = animals[index];
			}
			animals = temp;
		}
		if (a != null)
			animals[countAnimals++] = a;
	}
}
