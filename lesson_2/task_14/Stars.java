/*
	Print rectangle with cross inside
in	: 5
recWidth = 5; recHeight = 5;
*/

public class Stars {
	public static void printSquare(int number) {
		if (number < 5)
			return;

		char[][] stars = new char[number][number];

		for (int i = 0; i < stars.length; i++) {
			for (int j = 0; j < stars[i].length; j++) {
				stars[i][j] = (i == j || i == 0 || j == 0 || i == number - 1 || j == number - 1 || j == number - i - 1) ? '*' : ' ';
				System.out.print(stars[i][j]);
			}
			System.out.println();
		}
	}
}
