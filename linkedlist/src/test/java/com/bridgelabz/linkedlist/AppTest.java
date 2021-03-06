package com.bridgelabz.linkedlist;

import static org.junit.Assert.*;

import org.junit.Test;

public class AppTest {

	@Test
	public void givenThreeNumbersToLinkedListTest() {
		AppTest<Integer> myFirstNode = new MyNode<>(56);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThreeNode = new MyNode<>(70);
		myFirstNode.setNext(mySecondNode);
		mySecondNode.setNext(myThreeNode);
		boolean result = myFirstNode.getNext().equals(mySecondNode) && mySecondNode.getNext().equals(myThreeNode);
		assertTrue(result);
	}

}
