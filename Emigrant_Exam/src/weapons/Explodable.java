package weapons;

public interface Explodable {

	default void explode(){
		
		System.out.println("Allahu Akbar! EXPLODE !");
	}
}
