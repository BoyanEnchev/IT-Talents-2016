import java.util.concurrent.Callable;

public class PeshoHackera implements Runnable{

	private static final int HACKER_MONEY = 30;
	private static Account account;
	
	
	
	
	public PeshoHackera(Account account) {
		
		this.account = account;
	}




	@Override
	public void run() {
		
		account.withDraw(HACKER_MONEY);
				
	}

	
}
