import java.util.Arrays;

public class ReverseArray {
	public static void reverse(int[] arr) {
		System.out.println("Array: " + Arrays.toString(arr));

		for (int i = 0; i < arr.length / 2; i++) {
			int temp = arr[i];
			arr[i] = arr[arr.length - 1 - i];
			arr[arr.length - 1 - i] = temp;
		}

		System.out.println("Reversed Array: " + Arrays.toString(arr));
	}
}

