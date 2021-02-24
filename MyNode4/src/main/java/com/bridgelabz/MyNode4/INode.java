package com.bridgelabz.MyNode4;

import com.bridgelabz.MyNode4.INode;

public interface INode<K> {
	K getKey();
	void setKey(K key);

	INode<K> getNext();
	void setNext(INode<K> next);
}
