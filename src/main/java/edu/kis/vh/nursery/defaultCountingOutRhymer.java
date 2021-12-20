package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	public static final int size = 12;
	public static final int returnError = -1;
	private int[] numbers = new int[size];

	public int total = -1;

	public void countIn(int in) {
		if (!isFull())
			numbers[++total] = in;
	}

	public boolean callCheck() {
		return total == -1;
	}

	public boolean isFull() {
		return total == 11;
	}

	protected int peekaboo() {
		if (callCheck())
			return returnError;

		return numbers[total];
	}

	public int countOut() {
		if (callCheck())
			return returnError;

		return numbers[total--];
	}

}
