package destination;

import exceptions.RoomException;

public class RoomWithChildren extends Room {

	private byte numChildren;

	public RoomWithChildren(int priceForNight, byte numAdults, int numOfRoom, byte numChildren) throws RoomException {
		super(priceForNight, numAdults, numOfRoom);
		if (numChildren > 0) {
			this.numChildren = numChildren;
		} else {
			throw new RoomException("Invalid number of childrens!");
		}
		setType(numAdults,numChildren);
	}

	private void setType(byte numAdults, byte numChildren) {
		if (numAdults > 0 && numChildren > 0) {
			if (numAdults <= 2) {
				switch (numChildren) {
				case 1:
					type = "2+1";
					break;
				case 2:
					type = "2+2";
					break;
				}
			}
			if (numAdults + numChildren > 4 && numAdults + numChildren < 6) {
				type = "Apart for six";
			}
			if (numAdults + numChildren > 6) {
				type = "Apart for six+";
			}

		}
	}

}
