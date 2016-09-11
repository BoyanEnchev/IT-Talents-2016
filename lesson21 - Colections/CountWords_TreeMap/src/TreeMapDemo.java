import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class TreeMapDemo {
	
	private static final String TEXT = "I love books"+ " Is love great" + " I love great books Great";
	
	private static Map<String,Integer> countWords(String text){
		@SuppressWarnings("resource")
		Scanner textScanner = new Scanner(text);
		Map<String,Integer> words = new TreeMap<String,Integer>();
		
		while(textScanner.hasNext()){
			String word = textScanner.next();
			Integer count = words.get(word);
			if(count == null) count = 0;
			words.put(word, count+1);
		}
		return words;
	}
	
	private static void Print(Map<String,Integer> words){								//Java 8, Lambda expression
		words.forEach((k,v) -> System.out.println( k + " --> " + v + " times."));
	}
	
	/*private static void Print(Map<String,Integer> words){								// Standard for each in map
		for(Map.Entry<String, Integer> i : words.entrySet()) System.out.println( i.getKey() + " --> " + i.getValue() + " times.");
	} */

	public static void main(String[] args) {
		
		Map<String,Integer> wordsCount = countWords(TEXT);
		Print(wordsCount);
	}
}


