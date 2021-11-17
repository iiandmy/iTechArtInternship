import java.util.Scanner;

public class MinElement {
	public static int readInt(Scanner in) {
		return in.nextInt();
	}

	public static int[] readElements(int elementsCount) {
		int[] result = new int[elementsCount];
		Scanner in = new Scanner(System.in);

		for (int i = 0; i < result.length; i++)
			result[i] = readInt(in);

		in.close();
		return result;
	}

	public static void printArr(int[] arr) {
		for (int i = 0; i < arr.length; i++)
			System.out.printf("Element %d with value of %d\n", i, arr[i]);
	}

	public static int findMin(int[] arr) {
		int result = arr[0];
		for (int el : arr)
			result = result > el ? el : result;
		return result;
	}
}
