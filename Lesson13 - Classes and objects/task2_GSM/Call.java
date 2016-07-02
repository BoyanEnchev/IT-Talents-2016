
public class Call {

	double priceForAMinute;
	Gsm caller;
	Gsm receiver;
	byte duration; // edin razgovor e ne po-dulug ot 60min

	Call() {
		priceForAMinute = 0.24;
	}

	Call(double priceForAMinute, Gsm caller, Gsm receiver, byte duration) {
		this.priceForAMinute = priceForAMinute;
		this.caller = caller;
		this.receiver = receiver;
		this.duration = duration;
	}
}
