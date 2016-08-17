import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Demo {

	public static void main(String[] args) throws MalformedURLException, IOException {
		
		Scanner sc = new Scanner(new URL("http://textfiles.com/drugs/12reason.leg").openStream());
		
		StringBuilder builder = new StringBuilder();
		
		while(sc.hasNext()){
			builder.append(sc.nextLine());
			builder.append('\n');
		}
		sc.close();
		
		String text = builder.toString();
		
		int count = 0;
		
		/*
		for(int index = 0; index < text.length(); index++){
			if(text.charAt(index) == ',')
				count++;
		}
		
		long end = System.currentTimeMillis() - start;
		
		System.out.println("vreme " + end + " , broi: " + count);
		*/
	
		ThreadGroup groupCounters = new ThreadGroup("Counters");
		Set<Counter> counters = new HashSet<Counter>();
		ThreadGroup countersGroup = new ThreadGroup("counters");
		
		long start = System.currentTimeMillis();
		
		for(int index = 0; index < 5; index++){
			
			Counter tempCounter = new Counter(index * text.length() / 5 , index * text.length()/5 + text.length()/5 ,text);
			Thread t = new Thread(countersGroup ,tempCounter);
			counters.add(tempCounter);
			t.start();
			/*
			try {
				t.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}*/
			
		}
		
		while(countersGroup.activeCount() != 0){
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		for(Counter thread : counters){
			count += thread.getCountThreads();
		}
		long end = System.currentTimeMillis() - start;
		
		System.out.println("counter-a na vsi4ki e : " + count + " , vreme: " + end + "ms");
	}

}
