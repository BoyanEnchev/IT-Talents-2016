
public class Zad20 {

	public static void main(String[] args) {

		for (int i = 1; i <= 10; ++i) {
			int count = i;
			if (i == 10) {
				count = 0;
			}
			for (int j = 1; j <= 10; ++j) {
				if (count > 9) {
					count = 0;
				}
				System.out.print(count + " ");
				count++;
			}
			System.out.println();
		}

	}

}
