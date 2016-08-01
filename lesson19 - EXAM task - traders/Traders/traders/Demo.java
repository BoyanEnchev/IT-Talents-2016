package traders;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import deliverers.Deliverer;

public class Demo {

	private static final int NUM_OF_TRADER_INSTANCE = 3;

	public static void main(String[] args) {

		try {
			List<Trader> traders= new ArrayList<Trader>();
			List<Deliverer> deliverers = new ArrayList<Deliverer>();
			String[] traderNames = {"T Petko", "T Mariq", "T Sasho", "T Misho", "T Gergana"};
			String[] delivererNames = {"D Gosho", "D Nikoleta", "D Pena", "D Boyan", "D Dragan"}; 
			
		
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		

	}


	
}
