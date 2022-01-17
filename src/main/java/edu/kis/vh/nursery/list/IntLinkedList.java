package edu.kis.vh.nursery.list;

public class IntLinkedList {

	private static final int returnError = -1;
	private Node last;


	/**
	 * @param i
	 */
	public void push(int i) {
		if (last == null)
			last = new Node(i);
		else {
			last.setNext(new Node(i));
			last.getNext().setPrev(last);
			last = last.getNext();
		}
	}


	/**
	 * @return boolean
	 */
	public boolean isEmpty() {
		return last == null;
	}


	/**
	 * @return boolean
	 */
	public boolean isFull() {
		return false;
	}


	/**
	 * @return int
	 */
	public int top() {
		if (isEmpty())
			return returnError;
		return last.getValue();
	}


	/**
	 * @return int
	 */
	public int pop() {
		if (isEmpty())
			return returnError;
		int ret = last.getValue();
		last = last.getPrev();
		return ret;
	}

}
