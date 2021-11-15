/*
	Solve flour pack problem.
	Big packs - 5 kilos, small - 1 kilos.
	Goal weight must be == big amount * 5 + small amount * 1.
	However you can't divide big packs. Some packs can be left.
*/

public class FlourPackProblem {
	public static boolean canPack(int bigAmount, int smallAmount, int goalWeight) {
		if (bigAmount < 0 || smallAmount < 0 || goalWeight < 0)
			return false;

		if (bigAmount * 5 > goalWeight)
			return false;

		int weight = bigAmount * 5 + smallAmount;
		if (weight >= goalWeight)
			return true;

		return false;
	}
}
