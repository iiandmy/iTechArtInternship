/*
	Solve flour pack problem.
	Big packs - 5 kilos, small - 1 kilos.
	Goal weight must be == big amount * 5 + small amount * 1.
	However you can't divide big packs. Some packs can be left.
*/

public class FlourPackProblem {
	private static final int bigPackWeight = 5;
	private static final int smallPackWeight = 2;

	public static boolean canPack(int bigAmount, int smallAmount, int goalWeight) {
		if (bigAmount < 0 || smallAmount < 0 || goalWeight < 0)
			return false;

		for (int bigPackAmount = 1; bigPackAmount <= bigAmount; bigPackAmount++) {
			int weight = bigPackAmount * bigPackWeight;
			while (weight < goalWeight) {
				weight += smallAmount * smallPackWeight;
			}
			if (weight == goalWeight)
				return true;
		}

		return false;
	}
}
