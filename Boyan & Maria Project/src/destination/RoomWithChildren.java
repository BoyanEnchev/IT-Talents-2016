package destination;

import exceptions.RoomException;

public class RoomWithChildren extends Room{
	
	private byte numChildren;

	public RoomWithChildren(int priceForNight, byte numAdults, int numOfRoom, byte numChildren) throws RoomException {
		super(priceForNight, numAdults, numOfRoom);
		if(numChildren>0){
		this.numChildren = numChildren;}
		else{
			throw new RoomException("Invalid number of childrens!");
		}
	}
	

}
