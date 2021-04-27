
public class J3 {
	protected Integer[] Vector = new Integer[100];

	public J3(Integer[] vector) {
		Vector = vector;
	}

	private int Min() {
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < Vector.length; i++) {
			min = Math.min(min, Vector[i]);
		}
		return min;
	}

	private int Max() {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < Vector.length; i++) {
			max = Math.max(max, Vector[i]);
		}
		return max;
	}

	public void PrintareMaxMin() {
		System.out.println("Minimul este : " + Min() + " si maximul este : " + Max());
	}
}
