package postoffice;

import exceptions.PersonException;

public class Postman extends Person implements Runnable{
	
	PostOffice postoffice;

	public Postman(String firstname, String lastname, PostOffice postoffice) throws PersonException {
		super(firstname, lastname);
		this.postoffice = postoffice;
	}

	@Override
	public void run() {
		
		while(true){
			
			while(postoffice.getHranilishteSize() < 50){
				synchronized (postoffice) {
					try {
						postoffice.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
			
		
			
			while(postoffice.getHranilishteSize() > 0)
				synchronized (postoffice) {
				PostObject delivery = postoffice.getPostObjectToDeliver();
				if(delivery != null)
					System.out.println("POSTMAN: " + delivery.toString());
				else
					System.out.println("POSTMAN: emi to ne ostanaha pisma, otivam da nosya.");
			}
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			synchronized (postoffice) {
				postoffice.notifyAll();
			}
			
		}
	}

}
