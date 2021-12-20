package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	private static final int size = 12;
	private static final int returnError = -1;
	private static final int totalInitialValue = -1;
	private int[] numbers = new int[size];

	private int total = totalInitialValue;

	public int getTotal() {
		return total;
	}

	public void countIn(int in) {
		if (!isFull())
			numbers[++total] = in;
	}

	public boolean callCheck() {
		return total == totalInitialValue;
	}

	public boolean isFull() {
		return total == size - 1;
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
