package animals;

public class Demo {

	public static void showAnimalsInfo(Zoo zoopark) {
		for (int index = 0; index < zoopark.countAnimals; index++) {
			System.out.print(zoopark.animals[index].name + " ");
			zoopark.animals[index].maxSpeed();
		}

	}

	public static void main(String[] args) {

		Animal mechka = new Bear("Baba meca");
		Animal luvcho = new Lion("Car Luv");

		Zoo zoopark = new Zoo();
		zoopark.addAnimal(mechka);
		zoopark.addAnimal(luvcho);

		showAnimalsInfo(zoopark);

	}

}
