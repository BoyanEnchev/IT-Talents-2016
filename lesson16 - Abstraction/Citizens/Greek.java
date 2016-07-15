
public class Greek  implements ICitizen {

	@Override
	public boolean hasWife(boolean hasWife) {
		System.out.println("Gruka ima li jena?");
		return hasWife;
	}

	@Override
	public void danukaETolkova() {
		System.out.println("In Greece taxes for apartament is: 500 euro.");
	}

	@Override
	public void paidByHour() {
		System.out.println("Greeks get 6 euro per hour.");
		
	}

}
