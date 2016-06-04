import java.util.Scanner;

public class task4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[][] dates = new int[3][31];
		int[] countDates = new int[31];

		for (int index1 = 0; index1 < dates.length; index1++) {
			System.out.println("Enter " + (index1 + 1) + " month rest days: ");

			String restDays = sc.nextLine();
			String[] str = restDays.split(" ");

			for (int index2 = 1; index2 < str.length + 1; index2++) {
				dates[index1][index2] = Integer.parseInt(str[index2 - 1]);
				countDates[dates[index1][index2]] = countDates[dates[index1][index2]] + 1;
			}
			dates[index1][0] = str.length;
		}

		int happyMonth = 0, happyIndex = 0;
		for (int index = 0; index < dates.length; index++) {
			if (happyMonth < dates[index][0]) {
				happyMonth = dates[index][0];
				happyIndex = index;
			}
		}
		System.out.println("The month with the most rest days:");
		for (int i = 1; i <= dates[happyIndex][0]; i++) {
			System.out.print(dates[happyIndex][i] + " ");
		}
		System.out.println();

		int mostFrequentDay = countDates[1], mostFrequentIndex = 1;
		for (int index = 1; index < countDates.length; index++) {
			if (mostFrequentDay < countDates[index]) {
				mostFrequentDay = countDates[index];
				mostFrequentIndex = index;
			}
		}
		System.out.println(mostFrequentIndex);

	}

}
