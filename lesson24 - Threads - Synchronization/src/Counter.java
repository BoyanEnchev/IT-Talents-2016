
public class Counter implements Runnable{

	private static Integer count = 1;
	
	@Override
	public void run() {
		
		synchronized (count) {
			count++;
			
		}
		
	}

	public static Integer getCount() {
		return count;
	}
	

}
