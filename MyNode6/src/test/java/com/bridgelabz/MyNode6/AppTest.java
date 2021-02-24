package com.bridgelabz.MyNode6;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public void givenLastElementWhenDeletedShouldPassLinkedListResult() {
	MyNode<Integer> myFirstNode = new MyNode<>(56);
	MyNode<Integer> mySecondNode = new MyNode<>(30);
	MyNode<Integer> myThirdNode = new MyNode<>(70);
	MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();
	myLinkedList.add(myFirstNode);
	myLinkedList.append(mySecondNode);
	myLinkedList.append(myThirdNode);
	assertEquals(myThirdNode, myLinkedList.popLast());
	myLinkedList.print();
}

}