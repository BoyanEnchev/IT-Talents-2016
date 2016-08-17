package destination;

public class RoomWithChildren extends Room{
	
	private byte numChildren;

	public RoomWithChildren(int priceForNight, byte numAdults, byte numChildren) {
		super(priceForNight, numAdults);
		this.numChildren =numChildren;
	}
	

}
