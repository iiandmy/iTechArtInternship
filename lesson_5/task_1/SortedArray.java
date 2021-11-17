import java.util.Scanner;

public class SortedArray {
	public static int[] getIntegers(int size) {
		Scanner in = new Scanner(System.in);
		int[] result = new int[size];

		for (int i = 0; i < size; i++)
			result[i] = in.nextInt();

		in.close();
		return result;
	}

	public static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++)
			System.out.printf("Element %d with value %d\n", i, arr[i]);
	}

	public static int[] sort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int temp = arr[i];
			int j =i;
			while (j > 0 && arr[j - 1] < temp) {
				arr[j] = arr[j - 1];
				j--;				
			}
			arr[j] = temp;
		}
		return arr;
	}
}
