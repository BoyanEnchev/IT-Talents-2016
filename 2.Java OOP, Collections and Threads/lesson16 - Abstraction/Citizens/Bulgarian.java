
public class Bulgarian  implements ICitizen {

	@Override
	public boolean hasWife(boolean hasWife) {
		System.out.println("Bulgarina ima li jena?");
		return hasWife;
	}

	@Override
	public void danukaETolkova() {
		System.out.println("In BG taxes for apartament is: 250 euro.");
	}

	@Override
	public void paidByHour() {
		System.out.println("Bulgarians get 3 euro per hour.");
		
	}

}
