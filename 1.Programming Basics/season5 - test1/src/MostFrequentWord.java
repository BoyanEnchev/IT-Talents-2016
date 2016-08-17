
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

	static String mostFrequentLetter(String text) {

		text = text.replaceAll("[ ]", "");
		String[] letters = text.split("");
		int maxCount = 0, index = 0;

		for (int index1 = 0; index1 < letters.length; index1++) {
			int count = 0;

			for (int index2 = index1; index2 < letters.length; index2++) {
				if (letters[index1].equals(letters[index2])) {
					count++;
				}
			}
			if (count > maxCount) {
				maxCount = count;
				index = index1;
			}
		}

		return letters[index];

	}

	public static void main(String[] args) {

		String text = "dog cat dog mouse pig dog cat dog";

		System.out.println("word: " + mostFrequentWord(text));		//word: dog
		System.out.println("letter: " + mostFrequentLetter(text));	//letter: o
	}

}
