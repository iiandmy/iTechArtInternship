public class Main {
	public static void main(String[] args) {
		int[] arr = MinElement.readElements(5);
		MinElement.printArr(arr);
		System.out.println(MinElement.findMin(arr));
	}
}
