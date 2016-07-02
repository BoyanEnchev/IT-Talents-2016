
public class Demo {

	public static void main(String[] args) {

		Gsm iphone = new Gsm("iphone 6s", "0898313732", 800);
		Gsm samsung = new Gsm("Galaxy S7", "0832124383", 400);

		iphone.call(samsung, (byte) 30, 0.24);

		iphone.printInfoForTheLastOutgoingCall();
		samsung.printInfoForTheLastOutgoingCall();

	}

}
