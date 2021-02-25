package com.bridgelabz.stack1;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class MyStackTest {

	@Test
	public void given3NumbersWhenAddedToStackShouldHaveLastAddedNodeFirst() {
		MyNode<Integer> myFirstNode = new MyNode<>(70);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(56);
		MyStack<Integer> myLinkedList = new MyStack<>();
		myLinkedList.push(myFirstNode);
		myLinkedList.push(mySecondNode);
		myLinkedList.push(myThirdNode);
		myLinkedList.printStack();

	}

@Test

public void given3NumbersInStackWhenPopedShouldMatchWithLastAddedNode() {
	MyNode<Integer> myFirstNode = new MyNode<>(70);
	MyNode<Integer> mySecondNode = new MyNode<>(30);
	MyNode<Integer> myThirdNode = new MyNode<>(56);
	MyStack<Integer> myLinkedList = new MyStack<>();
	myLinkedList.push(myFirstNode);
	myLinkedList.push(mySecondNode);
	myLinkedList.push(myThirdNode);
	myLinkedList.printStack();

	MyStack<Integer> myStack = new MyStack<>();
	myStack.push(myFirstNode);
	myStack.push(mySecondNode);
	myStack.push(myThirdNode);
	System.out.print("Stack before pop: ");
	myStack.printStack();
	assertEquals(myThirdNode, myStack.pop());
	System.out.print("Stack after pop: ");
	myStack.printStack();
}



public class MyQueueTest {

	@Test
	public void given3NumbersWhenAddedToStackShouldHaveLastAddedNode() {
		MyNode<Integer> myFirstNode = new MyNode<>(56);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(70);
		MyQueue<Integer> myQueue = new MyQueue<>();
		myQueue.add(myFirstNode);
		myQueue.add(mySecondNode);
		myQueue.add(myThirdNode);
		System.out.print("Queue: ");
		myQueue.printQueue();
	}

}

@Test
public void given3NumbersInQueueWhenPopedShouldMatchFirstAddedNode() {
	MyNode<Integer> myFirstNode = new MyNode<>(56);
	MyNode<Integer> mySecondNode = new MyNode<>(30);
	MyNode<Integer> myThirdNode = new MyNode<>(70);
	MyQueue<Integer> myQueue = new MyQueue<>();
	myQueue.add(myFirstNode);
	myQueue.add(mySecondNode);
	myQueue.add(myThirdNode);
	assertEquals(myFirstNode, myQueue.remove1());
	System.out.print("Queue after removing first: ");
	myQueue.printQueue();
}

}