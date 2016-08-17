
public class Demo {
	
	public static void showInfo(ICitizen i){
		i.hasWife(true);
		i.danukaETolkova();
		i.paidByHour();
	}

	public static void main(String[] args) {
		
		ICitizen g = new German();
		ICitizen b = new Bulgarian();
		ICitizen k = new Greek();
		
		showInfo(g);
		showInfo(b);
		showInfo(k);

	}

}
