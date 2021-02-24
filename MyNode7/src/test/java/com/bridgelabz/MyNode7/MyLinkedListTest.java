package com.bridgelabz.MyNode7;
import static org.junit.Assert.*;
import org.junit.Ignore;
import org.junit.Test;

import com.bridgelabz.MyLinkedList;
import com.bridgelabz.MyNode;
public class MyLinkedListTest {


	@Test
	public void given3NumberWhenSearchShouldPassLinkedListResult() {
		MyNode myFirstNode = new MyNode(56);
		MyNode mySecondNode = new MyNode(30);
		MyNode myThirdNode = new MyNode(70);
		MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();
		myLinkedList.add(myFirstNode);
		myLinkedList.append(mySecondNode);
		myLinkedList.append(myThirdNode);
		assertEquals(mySecondNode, myLinkedList.search(30));
		myLinkedList.print();
	}

}