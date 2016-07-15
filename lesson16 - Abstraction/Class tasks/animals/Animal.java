package animals;

public abstract class Animal {

	String name;

	Animal(String name) {
		if (name != null) {
			this.name = name;
		}
	}

	public abstract void maxSpeed();
}
