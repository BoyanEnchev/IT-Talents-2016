
public class German implements ICitizen  {

	@Override
	public boolean hasWife(boolean hasWife) {
		System.out.println("Germaneca ima li jena?");
		return hasWife;
	}

	@Override
	public void danukaETolkova() {
		System.out.println("In German taxes for apartament is: 1000 euro.");
		
	}

	@Override
	public void paidByHour() {
		
		System.out.println("Germans get 10euro per hour.");
	}

	
}
