package com.bridgelabz.MyNode9;

import com.bridgelabz.MyNode9.INode;

public interface INode<K> {
	K getKey();
	void setKey(K key);

	INode<K> getNext();
	void setNext(INode<K> next);
}
