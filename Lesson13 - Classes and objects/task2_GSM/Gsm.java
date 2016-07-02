
public class Gsm {

	String model;
	boolean hasSimCard;
	String simMobileNumber;
	int outgoingCallsDuration;
	Call lastIncomingCall;
	Call lastOutgoingCall;

	Gsm() {
		model = "";
		simMobileNumber = "";
		hasSimCard = false;
	}

	Gsm(String model) {
		this.model = model;
	}

	Gsm(String model, String simMobileNumber, int outgoingCallsDuration) {
		this(model);
		insertSimCard(simMobileNumber); // izpolzvame insertSimCard() za da
										// validirame i zapishem nomera
		this.outgoingCallsDuration = outgoingCallsDuration;
	}

	boolean isValidNumber(String newNumber) {
		if (newNumber.length() != 10 || newNumber.charAt(0) != '0' || newNumber.charAt(1) != '8') {
			return false;
		}

		for (int index = 2; index < 10; index++) {
			if (newNumber.charAt(index) < '0' || newNumber.charAt(index) > '9') {
				return false;
			}
		}
		return true;
	}

	void insertSimCard(String newNumber) {

		if (isValidNumber(newNumber)) {
			this.hasSimCard = true;
			this.simMobileNumber = newNumber;
		} else {
			System.out.println("Invalid phone number!");
		}
	}

	void removeSimCard() {
		this.hasSimCard = false;
		this.simMobileNumber = "";
	}

	void call(Gsm receiver, byte duration, double priceForMinute) {

		if (duration > 0 && duration < 60 && this != receiver && (this.hasSimCard) && (receiver.hasSimCard)) {

			this.lastOutgoingCall = new Call(priceForMinute, this, receiver, duration);
			receiver.lastIncomingCall = new Call(priceForMinute, this, receiver, duration);
			this.outgoingCallsDuration += duration;
		} else {
			System.out.println("Invalid call!");
		}
	}

	void printInfoForTheLastOutgoingCall() {
		if (this.lastOutgoingCall == null) {
			System.out.println("Vse oste nqma razgovor!");
		} else {
			System.out.println("Last outgoing call: ");
			System.out.print("caller: " + this.model + "\nreciever: " + this.lastOutgoingCall.receiver.model
					+ "\nduration: " + this.lastOutgoingCall.duration + " min \nS");
		}
	}

	void printInfoForTheLastIncomingCall() {
		if (this.lastIncomingCall == null) {
			System.out.println("Vse oste nqma razgovor!");
		} else {
			System.out.println("Last incoming call: ");
			System.out.print("caller: " + this.lastIncomingCall.caller.model + "\nreciever: " + this.model
					+ "\nduration: " + this.lastOutgoingCall.duration + " min \n");
		}
	}
}
