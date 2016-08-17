package weapons;

import java.util.Random;

public interface Shootable {

	default int shoot(){
		Random r = new Random();
		int bullets = r.nextInt(60) + 11;
		System.out.println("I shoot with " + bullets + " patrons");
		return bullets;
	}
}
