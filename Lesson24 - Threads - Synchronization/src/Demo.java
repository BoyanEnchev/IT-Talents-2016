
public class Demo {

	private static final int NUMBER_OF_HACKERS = 20;

	public static void main(String[] args) {

		Account account = new Account(300);

		/*
		 * for (int hacker = 1; hacker < NUMBER_OF_HACKERS; hacker++) { new
		 * Thread(new PeshoHackera(account)).start(); }
		 */

		for (int i = 0; i < 100; i++) {

			for (int index = 0; index < 10; index++) {
				Counter counter = new Counter();

				new Thread(counter).start();
				System.out.println(counter.getCount());
				try {
					Thread.currentThread().sleep(3);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		}

	}

}
