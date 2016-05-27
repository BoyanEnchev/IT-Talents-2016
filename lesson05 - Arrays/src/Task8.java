
public class Task8 {

	public static void main(String[] args) {

		int[] arr = { 7, 5, 5, 1, 1, 1, -4, 6, 6 };
		int count = 1, maxCount = 1, startIndex = 0;

		for (int index = 0; index < arr.length - 1; index++) {
			if (arr[index] != arr[index + 1]) {
				count = 1;
			}
			if (arr[index] == arr[index + 1]) {
				count++;
			}
			if (count > maxCount) {
				maxCount = count;
				startIndex = index - maxCount + 2;
			}
		}

		for (int i = startIndex; i < startIndex + maxCount; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
