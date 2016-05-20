
public class Zad1 {

	public static void main(String[] args) {

		int count = 0;
		int i = -100;
		do {
			if (count <= 200) {
				System.out.println(i + ",");
				i++;
			}
			if (count == 200) {
				System.out.println();
			}
			if (count > 200) {
				System.out.println(i + ",");
				i--;
			}
			
			count++;
		} while (count < 403);

	}
}
