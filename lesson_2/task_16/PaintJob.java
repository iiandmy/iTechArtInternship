/*
	Calculate buckets count needed to cover all the wall, considering extra buckets count.
*/

public class PaintJob {
	public static int calcBucketsCount(double area, double areaPerBucket, int extraBuckets) {
		if (area <= 0 || areaPerBucket <= 0 || extraBuckets < 0)
			return -1;

		int bucketsCount = (int) Math.floor(area / areaPerBucket) + extraBuckets;

		return bucketsCount;
	}
}
