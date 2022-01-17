package edu.kis.vh.nursery.list;

public class Node {

	private int value;
	private Node prev;
	private Node next;

	/**
	 * constructor that sets initial value of the node
	 * @param i
	 */
	public Node(int i) {
		value = i;
	}


	/**
	 * sets value of current node
	 * @param value
	 */
	public void setValue(int value) {
		this.value = value;
	}


	/**
	 * returns value of current node
	 * @return int
	 */
	public int getValue() {
		return value;
	}


	/**
	 * sets previous node to the node from function parameter
	 * @param prev
	 */
	public void setPrev(Node prev) {
		this.prev = prev;
	}


	/**
	 * returns previous node
	 * @return Node
	 */
	public Node getPrev() {
		return prev;
	}


	/**
	 * sets next node to the node from function parameter
	 * @param next
	 */
	public void setNext(Node next) {
		this.next = next;
	}


	/**
	 * returns next node
	 * @return Node
	 */
	public Node getNext() {
		return next;
	}

}
