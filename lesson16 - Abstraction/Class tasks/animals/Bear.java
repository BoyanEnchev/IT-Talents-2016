package animals;

public class Bear extends Animal {

	boolean isSleepDurringWinter;

	Bear(String name) {
		super(name);
		this.isSleepDurringWinter = true;
	}

	@Override
	public void maxSpeed() {

		System.out.println("ticha s 40km/h");
	}

}
