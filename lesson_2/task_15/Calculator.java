import java.util.Scanner;

/*
	Calculator reads int nums from console unless something but int printed.
	After that it calculates sum of entered numbers and their average value.
*/

public class Calculator {
	public static void sumAndAvg() {
		Scanner in = new Scanner(System.in);
		int sum = 0;
		int count = 0;
		while (in.hasNextInt()) {
			sum += in.nextInt();
			count++;
		}
		in.close();
		
		double avg = (double) sum / count;

		System.out.printf("SUM = %d AVG = %.2f\n", sum, avg);
	}
}
