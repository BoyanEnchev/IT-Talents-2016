
public class Account {

	private Integer balance;

	public Account(int balance) {
		this.balance = balance;
	}

	public void withDraw(int sum) {

		synchronized (this.balance) {

			System.out.println("Toq iska da tegli: 30lv");

			if (this.balance >= sum) {

				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				balance -= sum;
				System.out.println("Az si drupnah 30 pari i v account ostanaha " + balance);
			} else {
				System.out.println("Tuka nqma tolkoz pari!");
			}
		}

	}

	public int getBalance() {
		return balance;
	}

}
