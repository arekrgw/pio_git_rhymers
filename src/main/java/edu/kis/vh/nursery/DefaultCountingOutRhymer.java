package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	private static final int size = 12;
	private static final int returnError = -1;
	private static final int totalInitialValue = -1;
	private int[] numbers = new int[size];

	private int total = totalInitialValue;


	/**
	 * @return int
	 */
	public int getTotal() {
		return total;
	}


	/**
	 * @param in
	 */
	public void countIn(int in) {
		if (!isFull())
			numbers[++total] = in;
	}


	/**
	 * @return boolean
	 */
	public boolean callCheck() {
		return total == totalInitialValue;
	}


	/**
	 * @return boolean
	 */
	public boolean isFull() {
		return total == size - 1;
	}


	/**
	 * @return int
	 */
	protected int peekaboo() {
		if (callCheck())
			return returnError;

		return numbers[total];
	}


	/**
	 * @return int
	 */
	public int countOut() {
		if (callCheck())
			return returnError;

		return numbers[total--];
	}

}
