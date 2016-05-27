
public class Task18 {

	public static void main(String[] args) {

		int[] arr1 = { 18, 19, 32, 1, 3, 4 };
		int[] arr2 = { 1, 2, 3, 4, 5, 16, 17, 18, 27, 11 };
		int[] arr3 = new int[arr1.length];

		for (int i = 0; i < (arr1.length) && (i < arr2.length); i++) {
			if (arr1[i] > arr2[i]) {
				arr3[i] = arr1[i];
			} else {
				arr3[i] = arr2[i];
			}
		}

		for (int i = 0; i < (arr1.length) && (i < arr2.length); i++) {
			System.out.print(arr3[i] + " ");
		}

	}

}
