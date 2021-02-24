package com.bridgelabz.MyNode2;

import static org.junit.Assert.*;
import org.junit.Test;
public class MyLinkedListTest {
	
	@Test
	public void given3NumbersWhenAppendedShouldBeAddedToLast() {
		MyNode<Integer> myFirstNode = new MyNode<Integer>(null);
		MyNode<Integer> mySecondNode = new MyNode<Integer>(null);
		MyNode<Integer> myThreeNode = new MyNode<Integer>(null);
		MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();
		myLinkedList.append(myFirstNode);
		myLinkedList.append(mySecondNode);
		myLinkedList.append(myThreeNode);
		myLinkedList.print();
		boolean result = myLinkedList.head.equals(myFirstNode) && myLinkedList.head.getNext().equals(mySecondNode)
				&& myLinkedList.tail.equals(myThreeNode);
		assertTrue(result);
	}

}