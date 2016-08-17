package demoTrade;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import deliverers.BigDeliverer;
import deliverers.Deliverer;
import deliverers.SmallDeliverer;
import tradePlaces.MallShop;
import tradePlaces.StandShop;
import tradePlaces.StreetShop;
import tradePlaces.TradePlace;
import traders.AmbulantTrader;
import traders.Product;
import traders.Trader;

public class Demo {
	/*
	private static final int NUM_OF_TRADER_INSTANCE = 3;

	public static void main(String[] args) {

		try {
			List<Deliverer> deliverers = new ArrayList<Deliverer>();
			List<TradePlace> tradePlaces = new ArrayList<TradePlace>();
			String[] traderNames = { "T Petko", "T Mariq", "T Sasho", "T Misho", "T Gergana" };
			String[] delivererNames = { "D Gosho", "D Nikoleta", "D Pena", "D Boyan", "D Dragan" };
			Random r = new Random();

			// 1)
			for (int index = 0; index < 10; index++) {
				if (r.nextBoolean()) {
					deliverers.add(new SmallDeliverer(delivererNames[r.nextInt(delivererNames.length)]));
				} else {
					deliverers.add(new BigDeliverer(delivererNames[r.nextInt(delivererNames.length)]));
				}
			}

			
			 for (int i = 0; i < deliverers.size(); i++) {
			 System.out.println(i + ". type: " + deliverers.get(i).getClass()
			 	+ " , name: " + deliverers.get(i).getName()); }
			 

			// 2)
			for (int index = 0; index < 20; index++) {
				int chance = r.nextInt(3);
				switch (chance) {
				case 0:
					tradePlaces.add(new StandShop());
					break;
				case 1:
					tradePlaces.add(new StreetShop());
					break;
				case 2:
					tradePlaces.add(new MallShop());
					break;
				}
			}

			// 3)
			Trader t1 = new AmbulantTrader("AT Pesho", 100);
			Trader t2 = new AmbulantTrader("ET Maya OOD", 500);
			Trader t3 = new AmbulantTrader("Billa", 3000);
			
			// 4)
			for (int i = 0; i < tradePlaces.size(); i++) {
				int chance = r.nextInt(3);

				switch (chance) {
				case 0:
					t1.addTradePlace(tradePlaces.get(i));
					break;
				case 1:
					if (tradePlaces.get(i) instanceof MallShop)
						break;
					else
						t2.addTradePlace(tradePlaces.get(i));
					break;
				case 2:
					if (tradePlaces.get(i) instanceof StandShop)
						break;
					else
						t3.addTradePlace(tradePlaces.get(i));
					break;
				}

			}
			
			// 5)
			List<Trader> traders = new ArrayList<Trader>(Arrays.asList(t1,t2,t3));
			String[] namesProducts = {"kashkaval", "sirene", "mlqko", "shokoloadi", "pasta", "hlqb", "boza"};
			
			for(Trader t : traders){
				
				List<Product> products = generateProducts(namesProducts);
				t.makeOrder(deliverers.get(r.nextInt(deliverers.size())), (ArrayList<Product>) products);
			}
		
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

		Random r = new Random();

	}
		private static List<Product> generateProducts(String[] names) {
			List products = new ArrayList<Product>();
			Random r = new Random();
			int sizeOfProducts = r.nextInt(5)+1;
			for (int i = 0; i < sizeOfProducts; i++) {
				products.add(names[r.nextInt(names.length)]);
			}
			return products;
		}
		*/

}


