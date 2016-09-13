package postoffice;

import exceptions.PersonException;

public class Collector extends Person implements Runnable {

	private PostOffice postoffice;

	public Collector(String firstname, String lastname, PostOffice postoffice) throws PersonException {
		super(firstname, lastname);
		// TODO validation
		this.postoffice = postoffice;
	}

	@Override
	public void run() {

		while (true) {
			while (postoffice.getHranilishteSize() > 50) {
				synchronized (postoffice) {
					try {
						postoffice.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}

			while (!postoffice.boxesIsEmpty()) {
				
				synchronized (postoffice) {
					postoffice.izprazniBox();

				}
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				synchronized (postoffice) {
					postoffice.notify();

				}
			}
		}

	}

}
