package com.bridgelabz.linkedlist;

public class Linkedlist<K> {

	private K key;
	private Linkedlist<K> next;

	public Linkedlist(K key) {
		this.key = key;
		this.next = null;
	}

	public Linkedlist<K> getNext() {
		return next;
	}

	public void setNext(Linkedlist<K> mySecondNode) {
		this.next = mySecondNode;
	}
}