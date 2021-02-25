package com.bridgelabz.stack1;

public class MyQueue<K> {
	private final MyLinkedList<K> myLinkedList;

	public MyQueue() {
		myLinkedList = new MyLinkedList<K>();
	}

	/* enqueue method */
	public void add(INode<K> newNode) {
		myLinkedList.append(newNode);
	}

	/* Utility: Prints the queue */
	public void printQueue1() {
		myLinkedList.print();
	}
	/* shows and removes the first element added */
	public INode<K> remove() {
		return myLinkedList.pop();
	}

	/* peek method, shows the first element added */
	public INode<K> peek() {
		return myLinkedList.peek();
	}

	/* Utility: Prints the queue */
	public void printQueue() {
		myLinkedList.print();
	}

	public Object remove1() {
		// TODO Auto-generated method stub
		return null;
	}

}