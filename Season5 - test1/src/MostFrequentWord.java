
public class MostFrequentWord {

	static String mostFrequentWord(String text) {

		String[] words = text.split(" ");
		int maxCount = 0, index = 0;

		for (int index1 = 0; index1 < words.length; index1++) {
			int count = 0;

			for (int index2 = index1; index2 < words.length; index2++) {
				if (words[index1].equals(words[index2])) {
					count++;
				}
			}
			if (count > maxCount) {
				maxCount = count;
				index = index1;
			}
		}
		return words[index];
	}

	public static void main(String[] args) {

		String text = "cat horse dog horse dog lion tiger lion horse";

		System.out.println(mostFrequentWord(text));
	}

}
